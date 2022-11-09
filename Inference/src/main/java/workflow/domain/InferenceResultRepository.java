package workflow.domain;

import workflow.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="inferenceResults", path="inferenceResults")
public interface InferenceResultRepository extends PagingAndSortingRepository<InferenceResult, Long>{

}
