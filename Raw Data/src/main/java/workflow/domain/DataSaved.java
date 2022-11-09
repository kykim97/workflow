package workflow.domain;

import workflow.domain.*;
import workflow.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DataSaved extends AbstractEvent {

    private Long id;
    private String dataType;

    public DataSaved(RawData aggregate){
        super(aggregate);
    }
    public DataSaved(){
        super();
    }
}
