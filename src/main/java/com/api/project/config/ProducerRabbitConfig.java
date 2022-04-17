package com.api.project.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerRabbitConfig {
   
	@Value("${spring.rabbitmq.request.routing-key.producer}")
	private String queue;
	
	@Value("${spring.rabbitmq.request.exchange.producer}")
	private String exchange;
	
	@Value("${spring.rabbitmq.request.deadletter.producer}")
	private String deadLetter;
}
