package ottservice.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import ottservice.ServiceApplication;
import ottservice.domain.ServiceCanceled;
import ottservice.domain.ServiceStarted;

@Entity
@Table(name = "ServiceManagement_table")
@Data
//<<< DDD / Aggregate Root
public class ServiceManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String serviceName;

    private Long serviceId;

    private Date serviceDt;

    private Integer subscribeTime;

    @PreUpdate
    public void onPreUpdate() {
        ServiceStarted serviceStarted = new ServiceStarted(this);
        serviceStarted.publishAfterCommit();

        ServiceCanceled serviceCanceled = new ServiceCanceled(this);
        serviceCanceled.publishAfterCommit();
    }

    public static ServiceManagementRepository repository() {
        ServiceManagementRepository serviceManagementRepository = ServiceApplication.applicationContext.getBean(
            ServiceManagementRepository.class
        );
        return serviceManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void startService(Subscribed subscribed) {
        //implement business logic here:

        /** Example 1:  new item 
        ServiceManagement serviceManagement = new ServiceManagement();
        repository().save(serviceManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(subscribed.get???()).ifPresent(serviceManagement->{
            
            serviceManagement // do something
            repository().save(serviceManagement);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void cancelService(
        SubscriptionCanceled subscriptionCanceled
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ServiceManagement serviceManagement = new ServiceManagement();
        repository().save(serviceManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(subscriptionCanceled.get???()).ifPresent(serviceManagement->{
            
            serviceManagement // do something
            repository().save(serviceManagement);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
