package workflow.domain;

import workflow.domain.DataSaved;
import workflow.domain.DataSaved;
import workflow.RawDataApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="RawData_table")
@Data

public class RawData  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String dataType;

    @PostPersist
    public void onPostPersist(){


        DataSaved dataSaved = new DataSaved(this);
        dataSaved.publishAfterCommit();



        DataSaved dataSaved = new DataSaved(this);
        dataSaved.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){
    }

    public static RawDataRepository repository(){
        RawDataRepository rawDataRepository = RawDataApplication.applicationContext.getBean(RawDataRepository.class);
        return rawDataRepository;
    }






}
