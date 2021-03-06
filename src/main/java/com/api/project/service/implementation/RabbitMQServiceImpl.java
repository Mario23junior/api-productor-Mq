package com.api.project.service.implementation;

import org.springframework.stereotype.Service;

import com.api.project.amqp.AmqpProducer;
import com.api.project.model.Message;
import com.api.project.service.AmqpService;

@Service
public class RabbitMQServiceImpl implements AmqpService {

	 
	private AmqpProducer<Message> amqp;
	
	@Override
	public void sendToConsumer(Message message) {
		amqp.producer(message);
	}

}
