package workflow.common;


import workflow.InferenceApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InferenceApplication.class })
public class CucumberSpingConfiguration {
    
}
