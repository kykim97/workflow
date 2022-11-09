package workflow.infra;

import workflow.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="rawData", path="rawData")
public interface RawDataRepository extends PagingAndSortingRepository<RawData, Long> {

    

    
}
