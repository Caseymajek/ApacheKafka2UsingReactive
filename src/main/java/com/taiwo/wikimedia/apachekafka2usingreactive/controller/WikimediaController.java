package com.taiwo.wikimedia.apachekafka2usingreactive.controller;

import com.taiwo.wikimedia.apachekafka2usingreactive.producer.WikimediaProducer;
import com.taiwo.wikimedia.apachekafka2usingreactive.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/wikimedia")
public class WikimediaController {
    private final WikimediaStreamConsumer wikimediaStreamConsumer;

    @GetMapping
    public void startPublishing(){
        wikimediaStreamConsumer.consumeStreamAndPublish();
    }

}
