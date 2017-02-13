package com.creditease.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.creditease.producer.MessageProducer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class DirectConsumerTest {
	@Autowired
	private MessageProducer messageProducer;
	/**
	 * Junit4 单元测试
	 */
	@Test
	public void messageProducerTest() throws InterruptedException {
		messageProducer.sendMessage("--hello---");
		Thread.sleep(1000);
	}
	/**
	 * main 方法测试
	 */
	public static void main(final String... args) throws Exception {
		@SuppressWarnings("resource")
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		MessageProducer messageProducer = (MessageProducer) ctx.getBean("messageProducer");
		messageProducer.sendMessage("--hello---");
		Thread.sleep(1000);
		ctx.destroy();
	}
}
