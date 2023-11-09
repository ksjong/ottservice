package ottservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ottservice.domain.*;
import ottservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ServiceCanceled extends AbstractEvent {

    private Long id;
    private Long userId;
    private String serviceName;
    private Long serviceId;
    private Date serviceDt;
    private Integer subscribeTime;

    public ServiceCanceled(ServiceManagement aggregate) {
        super(aggregate);
    }

    public ServiceCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
