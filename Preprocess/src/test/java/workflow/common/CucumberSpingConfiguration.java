package workflow.common;


import workflow.PreprocessApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PreprocessApplication.class })
public class CucumberSpingConfiguration {
    
}
