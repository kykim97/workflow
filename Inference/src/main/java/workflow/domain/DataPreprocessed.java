package workflow.domain;

import workflow.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class DataPreprocessed extends AbstractEvent {

    private Long id;
    private Long RawDataID;
    private String DataType;
}
