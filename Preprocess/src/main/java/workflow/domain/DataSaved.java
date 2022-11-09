package workflow.domain;

import workflow.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class DataSaved extends AbstractEvent {

    private Long id;
    private String DataType;
}
