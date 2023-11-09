package ottservice.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import ottservice.config.kafka.KafkaProcessor;
import ottservice.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    ServiceManagementRepository serviceManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Subscribed'"
    )
    public void wheneverSubscribed_StartService(
        @Payload Subscribed subscribed
    ) {
        Subscribed event = subscribed;
        System.out.println(
            "\n\n##### listener StartService : " + subscribed + "\n\n"
        );

        // Sample Logic //
        ServiceManagement.startService(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='SubscriptionCanceled'"
    )
    public void wheneverSubscriptionCanceled_CancelService(
        @Payload SubscriptionCanceled subscriptionCanceled
    ) {
        SubscriptionCanceled event = subscriptionCanceled;
        System.out.println(
            "\n\n##### listener CancelService : " +
            subscriptionCanceled +
            "\n\n"
        );

        // Sample Logic //
        ServiceManagement.cancelService(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
