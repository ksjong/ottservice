package ottservice.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ottservice.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "subscriberManagements",
    path = "subscriberManagements"
)
public interface SubscriberManagementRepository
    extends PagingAndSortingRepository<SubscriberManagement, Long> {}
