package workflow.infra;
import workflow.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class WorkflowHistHateoasProcessor implements RepresentationModelProcessor<EntityModel<WorkflowHist>>  {

    @Override
    public EntityModel<WorkflowHist> process(EntityModel<WorkflowHist> model) {

        
        return model;
    }
    
}
