package workflow.domain;

import workflow.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="workflowHists", path="workflowHists")
public interface WorkflowHistRepository extends PagingAndSortingRepository<WorkflowHist, Long>{

}
