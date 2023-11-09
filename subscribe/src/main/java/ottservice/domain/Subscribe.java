package ottservice.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import ottservice.SubscribeApplication;
import ottservice.domain.Subscribed;
import ottservice.domain.SubscriptionCanceled;

@Entity
@Table(name = "Subscribe_table")
@Data
//<<< DDD / Aggregate Root
public class Subscribe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String serviceName;

    private Long serviceId;

    private Date subscribeDate;

    private Integer subscribeTime;

    @PostPersist
    public void onPostPersist() {
        Subscribed subscribed = new Subscribed(this);
        subscribed.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {
        SubscriptionCanceled subscriptionCanceled = new SubscriptionCanceled(
            this
        );
        subscriptionCanceled.publishAfterCommit();
    }

    public static SubscribeRepository repository() {
        SubscribeRepository subscribeRepository = SubscribeApplication.applicationContext.getBean(
            SubscribeRepository.class
        );
        return subscribeRepository;
    }
}
//>>> DDD / Aggregate Root
