/**
 * @author Bharath Prakash
 *
 */
package com.demo.kafka.service;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.demo.kafka.objects.User;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class KafkaConsumer {
	
	private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) throws IOException {
    	ObjectMapper objectMapper = new ObjectMapper();
    	User user = objectMapper.readValue(message.toString(), User.class);
        logger.info(String.format("#### -> Consumed message -> %s", user));
    }

}
