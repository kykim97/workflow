package workflow.domain;

import workflow.domain.*;
import workflow.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class WorkflowStarted extends AbstractEvent {

    private Long id;
    private Long rawDataId;
    private String dataType;

    public WorkflowStarted(WorkflowHist aggregate){
        super(aggregate);
    }
    public WorkflowStarted(){
        super();
    }
}
