package com.taiwo.wikimedia.apachekafka2usingreactive.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class WikimediaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void publishMessage(String msg){
        log.info(String.format("Sending message to taiwoTopic:: %s", msg));
        kafkaTemplate.send("wikimedia-stream", msg);
    }
}
