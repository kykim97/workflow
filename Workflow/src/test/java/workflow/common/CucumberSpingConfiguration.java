package workflow.common;


import workflow.WorkflowApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { WorkflowApplication.class })
public class CucumberSpingConfiguration {
    
}
