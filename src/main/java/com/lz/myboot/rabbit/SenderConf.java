package com.lz.myboot.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lz.myboot.common.Constant;

@Configuration
public class SenderConf {
	
	@Bean
    public Queue queue() {
         return new Queue(Constant.TEST_QUEUE_NAME);
    }

}
