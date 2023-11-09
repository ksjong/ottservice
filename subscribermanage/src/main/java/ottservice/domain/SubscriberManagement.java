package ottservice.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import ottservice.SubscribermanageApplication;
import ottservice.domain.SubscriberDecreased;
import ottservice.domain.SubscriberIncreased;

@Entity
@Table(name = "SubscriberManagement_table")
@Data
//<<< DDD / Aggregate Root
public class SubscriberManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String serviceName;

    private Date serviceTime;

    private Integer subscriberNumber;

    @PostUpdate
    public void onPostUpdate() {
        SubscriberIncreased subscriberIncreased = new SubscriberIncreased(this);
        subscriberIncreased.publishAfterCommit();

        SubscriberDecreased subscriberDecreased = new SubscriberDecreased(this);
        subscriberDecreased.publishAfterCommit();
    }

    public static SubscriberManagementRepository repository() {
        SubscriberManagementRepository subscriberManagementRepository = SubscribermanageApplication.applicationContext.getBean(
            SubscriberManagementRepository.class
        );
        return subscriberManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void increaseSubscriber(ServiceStarted serviceStarted) {
        //implement business logic here:

        /** Example 1:  new item 
        SubscriberManagement subscriberManagement = new SubscriberManagement();
        repository().save(subscriberManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(serviceStarted.get???()).ifPresent(subscriberManagement->{
            
            subscriberManagement // do something
            repository().save(subscriberManagement);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void decreaseSubscriber(ServiceCanceled serviceCanceled) {
        //implement business logic here:

        /** Example 1:  new item 
        SubscriberManagement subscriberManagement = new SubscriberManagement();
        repository().save(subscriberManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(serviceCanceled.get???()).ifPresent(subscriberManagement->{
            
            subscriberManagement // do something
            repository().save(subscriberManagement);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
