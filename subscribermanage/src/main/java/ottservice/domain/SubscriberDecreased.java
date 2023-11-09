package ottservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ottservice.domain.*;
import ottservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SubscriberDecreased extends AbstractEvent {

    private Long id;
    private String serviceName;
    private Date serviceTime;
    private Integer subscriberNumber;

    public SubscriberDecreased(SubscriberManagement aggregate) {
        super(aggregate);
    }

    public SubscriberDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
