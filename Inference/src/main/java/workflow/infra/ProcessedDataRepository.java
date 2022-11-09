package workflow.infra;

import workflow.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="processedData", path="processedData")
public interface ProcessedDataRepository extends PagingAndSortingRepository<ProcessedData, Long> {

    

    
}
