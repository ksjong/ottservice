package ottservice.domain;

import java.util.*;
import lombok.*;
import ottservice.domain.*;
import ottservice.infra.AbstractEvent;

@Data
@ToString
public class SubscriptionCanceled extends AbstractEvent {

    private Long id;
    private Long userId;
    private String serviceName;
    private Long serviceId;
    private Date subscribeDate;
    private Integer subscribeTime;
}
