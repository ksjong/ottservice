package ottservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ottservice.domain.*;
import ottservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ServiceStarted extends AbstractEvent {

    private Long id;
    private Long userId;
    private String serviceName;
    private Long serviceId;
    private Date serviceDt;
    private Integer subscribeTime;

    public ServiceStarted(ServiceManagement aggregate) {
        super(aggregate);
    }

    public ServiceStarted() {
        super();
    }
}
//>>> DDD / Domain Event
