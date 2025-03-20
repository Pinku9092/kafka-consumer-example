package com.pinku.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
	
	 Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);
	 
	 @KafkaListener(topics = "pinku-topic-from-code",groupId = "jt-group-1")
	 public void consume1(String message) {
		// System.out.println("consumer consume the message "+message);
		 log.info("consumer1 consume the message {}",message);
	 }
	 
	 @KafkaListener(topics = "pinku-topic-from-code",groupId = "jt-group-1")
	 public void consume2(String message) {
		// System.out.println("consumer consume the message "+message);
		 log.info("consumer2 consume the message {}",message);
	 }
	 
	 @KafkaListener(topics = "pinku-topic-from-code",groupId = "jt-group-1")
	 public void consume3(String message) {
		// System.out.println("consumer consume the message "+message);
		 log.info("consumer3 consume the message {}",message);
	 }
	 
	 @KafkaListener(topics = "pinku-topic-from-code",groupId = "jt-group-1")
	 public void consume4(String message) {
		// System.out.println("consumer consume the message "+message);
		 log.info("consumer4 consume the message {}",message);
	 }

}
