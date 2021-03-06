package com.api.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.project.model.Message;
import com.api.project.service.implementation.RabbitMQServiceImpl;

@RestController
@RequestMapping("/api/v1/message/")
public class AmqpController {
  
	@Autowired
	private RabbitMQServiceImpl service;
	
	@ResponseStatus(HttpStatus.ACCEPTED)
	@PostMapping
	public void sendToConsumer(@RequestBody Message message) {
		service.sendToConsumer(message);
	}
}
