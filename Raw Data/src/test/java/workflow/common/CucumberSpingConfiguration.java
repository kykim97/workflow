package workflow.common;


import workflow.RawDataApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { RawDataApplication.class })
public class CucumberSpingConfiguration {
    
}
