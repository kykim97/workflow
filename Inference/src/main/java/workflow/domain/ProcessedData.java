package workflow.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="ProcessedData_table")
@Data
public class ProcessedData {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String dataType;


}