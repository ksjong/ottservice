package ottservice.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ottservice.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "serviceManagements",
    path = "serviceManagements"
)
public interface ServiceManagementRepository
    extends PagingAndSortingRepository<ServiceManagement, Long> {}
