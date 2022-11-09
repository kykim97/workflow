package workflow.domain;

import workflow.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="processedData", path="processedData")
public interface ProcessedDataRepository extends PagingAndSortingRepository<ProcessedData, Long>{

}
