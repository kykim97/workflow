package workflow.infra;
import workflow.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class ProcessedDataHateoasProcessor implements RepresentationModelProcessor<EntityModel<ProcessedData>>  {

    @Override
    public EntityModel<ProcessedData> process(EntityModel<ProcessedData> model) {

        
        return model;
    }
    
}
