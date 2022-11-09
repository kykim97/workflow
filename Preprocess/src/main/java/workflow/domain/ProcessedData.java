package workflow.domain;

import workflow.domain.DataPreprocessed;
import workflow.domain.DataPreprocessed;
import workflow.PreprocessApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="ProcessedData_table")
@Data

public class ProcessedData  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long rawDataId;
    
    
    
    
    
    private String dataType;

    @PostPersist
    public void onPostPersist(){


        DataPreprocessed dataPreprocessed = new DataPreprocessed(this);
        dataPreprocessed.publishAfterCommit();



        DataPreprocessed dataPreprocessed = new DataPreprocessed(this);
        dataPreprocessed.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){
    }

    public static ProcessedDataRepository repository(){
        ProcessedDataRepository processedDataRepository = PreprocessApplication.applicationContext.getBean(ProcessedDataRepository.class);
        return processedDataRepository;
    }






}
