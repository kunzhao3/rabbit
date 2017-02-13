package com.creditease.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
/**
 * direct 方式的队列
 */
public class DirectConsumer implements MessageListener {
	private Logger logger = LoggerFactory.getLogger(DirectConsumer.class);

	@Override
	public void onMessage(Message message) {
		logger.info("receive message:{}", message);
	}
}
