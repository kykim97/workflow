package workflow.domain;

import workflow.domain.InferenceRun;
import workflow.domain.InferenceRun;
import workflow.InferenceApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="InferenceResult_table")
@Data

public class InferenceResult  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long processedDataId;
    
    
    
    
    
    private String inferenceResult;

    @PostPersist
    public void onPostPersist(){


        InferenceRun inferenceRun = new InferenceRun(this);
        inferenceRun.publishAfterCommit();



        InferenceRun inferenceRun = new InferenceRun(this);
        inferenceRun.publishAfterCommit();

    }

    public static InferenceResultRepository repository(){
        InferenceResultRepository inferenceResultRepository = InferenceApplication.applicationContext.getBean(InferenceResultRepository.class);
        return inferenceResultRepository;
    }




    public static void startInference(DataPreprocessed dataPreprocessed){

        /** Example 1:  new item 
        InferenceResult inferenceResult = new InferenceResult();
        repository().save(inferenceResult);

        */

        /** Example 2:  finding and process
        
        repository().findById(dataPreprocessed.get???()).ifPresent(inferenceResult->{
            
            inferenceResult // do something
            repository().save(inferenceResult);


         });
        */

        
    }


}
