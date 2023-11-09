package ottservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ottservice.domain.*;
import ottservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Subscribed extends AbstractEvent {

    private Long id;
    private Long userId;
    private String serviceName;
    private Long serviceId;
    private Date subscribeDate;
    private Integer subscribeTime;

    public Subscribed(Subscribe aggregate) {
        super(aggregate);
    }

    public Subscribed() {
        super();
    }
}
//>>> DDD / Domain Event
