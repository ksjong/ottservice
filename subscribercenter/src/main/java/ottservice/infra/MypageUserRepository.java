package ottservice.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ottservice.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "mypageUsers",
    path = "mypageUsers"
)
public interface MypageUserRepository
    extends PagingAndSortingRepository<MypageUser, Long> {}
