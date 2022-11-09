package workflow.domain;

import workflow.domain.WorkflowStarted;
import workflow.domain.WorkflowStarted;
import workflow.WorkflowApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="WorkflowHist_table")
@Data

public class WorkflowHist  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long rawDataId;
    
    
    
    
    
    private String dataType;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        workflow.external.ProcessedData processedData = new workflow.external.ProcessedData();
        // mappings goes here
        Application.applicationContext.getBean(workflow.external.ProcessedDataService.class)
            .preProcess(processedData);


        WorkflowStarted workflowStarted = new WorkflowStarted(this);
        workflowStarted.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        workflow.external.ProcessedData processedData = new workflow.external.ProcessedData();
        // mappings goes here
        WorkflowApplication.applicationContext.getBean(workflow.external.ProcessedDataService.class)
            .preProcess(processedData);


        WorkflowStarted workflowStarted = new WorkflowStarted(this);
        workflowStarted.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){
    }

    public static WorkflowHistRepository repository(){
        WorkflowHistRepository workflowHistRepository = WorkflowApplication.applicationContext.getBean(WorkflowHistRepository.class);
        return workflowHistRepository;
    }






}
