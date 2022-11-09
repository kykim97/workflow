package workflow.domain;

import workflow.domain.*;
import workflow.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class InferenceRun extends AbstractEvent {

    private Long id;
    private Long processedDataId;
    private String inferenceResult;

    public InferenceRun(InferenceResult aggregate){
        super(aggregate);
    }
    public InferenceRun(){
        super();
    }
}
