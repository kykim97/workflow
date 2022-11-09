package workflow.infra;
import workflow.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class RawDataHateoasProcessor implements RepresentationModelProcessor<EntityModel<RawData>>  {

    @Override
    public EntityModel<RawData> process(EntityModel<RawData> model) {

        
        return model;
    }
    
}
