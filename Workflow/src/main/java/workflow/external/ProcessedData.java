package workflow.external;

import lombok.Data;
import java.util.Date;
@Data
public class ProcessedData {

    private Long id;
    private Long rawDataId;
    private String dataType;
}


