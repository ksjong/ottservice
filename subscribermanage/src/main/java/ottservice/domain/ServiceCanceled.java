package ottservice.domain;

import java.util.*;
import lombok.*;
import ottservice.domain.*;
import ottservice.infra.AbstractEvent;

@Data
@ToString
public class ServiceCanceled extends AbstractEvent {

    private Long id;
    private Long userId;
    private String serviceName;
    private Long serviceId;
    private Date serviceDt;
    private Integer subscribeTime;
}
