package com.lz.myboot.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

import com.lz.myboot.common.Constant;

public class HelloReceive {
	
	@RabbitListener(queues = Constant.TEST_QUEUE_NAME) // 监听器监听指定的Queue
	public void receiveMsg(String str) {
		System.out.println("Receive:" + str);
	}
}
