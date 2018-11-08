package com.lz.myboot.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lz.myboot.common.Constant;

@Component
public class HelloSender {
	
	@Autowired
    private AmqpTemplate template;
	
	public void sendMsg() {
	    template.convertAndSend(Constant.TEST_QUEUE_NAME,"hello,rabbit~");
	}

}
