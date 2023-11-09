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
    SubscriberManagementRepository subscriberManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ServiceStarted'"
    )
    public void wheneverServiceStarted_IncreaseSubscriber(
        @Payload ServiceStarted serviceStarted
    ) {
        ServiceStarted event = serviceStarted;
        System.out.println(
            "\n\n##### listener IncreaseSubscriber : " + serviceStarted + "\n\n"
        );

        // Sample Logic //
        SubscriberManagement.increaseSubscriber(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ServiceCanceled'"
    )
    public void wheneverServiceCanceled_DecreaseSubscriber(
        @Payload ServiceCanceled serviceCanceled
    ) {
        ServiceCanceled event = serviceCanceled;
        System.out.println(
            "\n\n##### listener DecreaseSubscriber : " +
            serviceCanceled +
            "\n\n"
        );

        // Sample Logic //
        SubscriberManagement.decreaseSubscriber(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
