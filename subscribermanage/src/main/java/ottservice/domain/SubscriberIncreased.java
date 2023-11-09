package ottservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ottservice.domain.*;
import ottservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SubscriberIncreased extends AbstractEvent {

    private Long id;
    private String serviceName;
    private Date serviceTime;
    private Integer subscriberNumber;

    public SubscriberIncreased(SubscriberManagement aggregate) {
        super(aggregate);
    }

    public SubscriberIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
