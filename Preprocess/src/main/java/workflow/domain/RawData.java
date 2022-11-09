package workflow.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="RawData_table")
@Data
public class RawData {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String dataType;


}