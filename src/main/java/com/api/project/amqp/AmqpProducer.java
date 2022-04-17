package com.api.project.amqp;

import org.springframework.context.annotation.Bean;

public interface AmqpProducer<T> {

	@Bean
	void producer(T t);

}
