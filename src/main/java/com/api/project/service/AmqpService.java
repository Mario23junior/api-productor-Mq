package com.api.project.service;

import com.api.project.model.Message;

public interface AmqpService {

	void sendToConsumer(Message message);
}
