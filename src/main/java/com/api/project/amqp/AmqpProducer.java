package com.api.project.amqp;

public interface AmqpProducer<T> {
 
	void producer(T t);
	
}
