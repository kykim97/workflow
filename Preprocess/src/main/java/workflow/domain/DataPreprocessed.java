package workflow.domain;

import workflow.domain.*;
import workflow.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DataPreprocessed extends AbstractEvent {

    private Long id;
    private Long rawDataId;
    private String dataType;

    public DataPreprocessed(ProcessedData aggregate){
        super(aggregate);
    }
    public DataPreprocessed(){
        super();
    }
}
