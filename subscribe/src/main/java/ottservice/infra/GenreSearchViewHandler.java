package ottservice.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import ottservice.config.kafka.KafkaProcessor;
import ottservice.domain.*;

@Service
public class GenreSearchViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private GenreSearchRepository genreSearchRepository;
    //>>> DDD / CQRS
}
