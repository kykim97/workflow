package workflow.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import workflow.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import workflow.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired InferenceResultRepository inferenceResultRepository;
    @Autowired InferenceResultRepository inferenceResultRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DataPreprocessed'")
    public void wheneverDataPreprocessed_StartInference(@Payload DataPreprocessed dataPreprocessed){

        DataPreprocessed event = dataPreprocessed;
        System.out.println("\n\n##### listener StartInference : " + dataPreprocessed + "\n\n");


        

        // Sample Logic //

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DataPreprocessed'")
    public void wheneverDataPreprocessed_StartInference(@Payload DataPreprocessed dataPreprocessed){

        DataPreprocessed event = dataPreprocessed;
        System.out.println("\n\n##### listener StartInference : " + dataPreprocessed + "\n\n");


        

        // Sample Logic //
        InferenceResult.startInference(event);
        

        

    }

}


