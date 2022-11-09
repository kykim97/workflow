package workflow.infra;
import workflow.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class InferenceResultHateoasProcessor implements RepresentationModelProcessor<EntityModel<InferenceResult>>  {

    @Override
    public EntityModel<InferenceResult> process(EntityModel<InferenceResult> model) {

        
        return model;
    }
    
}
