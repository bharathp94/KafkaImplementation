/**
 * @author Bharath Prakash
 *
 */
package com.demo.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.kafka.objects.User;
import com.demo.kafka.service.KafkaProducer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	
	 @Autowired
	 private final KafkaProducer producer;

	    KafkaController(KafkaProducer producer) {
	        this.producer = producer;
	    }

	    @PostMapping(value = "/publish")
	    public void sendMessageToKafkaTopic(@RequestBody User user) {
	        this.producer.sendMessage(user);
	    }

}
