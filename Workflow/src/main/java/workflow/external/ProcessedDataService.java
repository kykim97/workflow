package workflow.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "Preprocess", url = "${api.url.Preprocess}")
public interface ProcessedDataService {
    @RequestMapping(method= RequestMethod.POST, path="/processedData")
    public void preProcess(@RequestBody ProcessedData processedData);
}

