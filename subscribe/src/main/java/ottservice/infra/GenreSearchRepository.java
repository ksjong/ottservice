package ottservice.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ottservice.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "genreSearches",
    path = "genreSearches"
)
public interface GenreSearchRepository
    extends PagingAndSortingRepository<GenreSearch, Long> {}
