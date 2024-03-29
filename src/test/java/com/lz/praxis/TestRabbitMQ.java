package com.lz.praxis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lz.myboot.MyBootApplication;
import com.lz.myboot.rabbit.HelloSender;

@SpringBootTest(classes=MyBootApplication.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitMQ {
	
	@Autowired
    private HelloSender helloSender;

    @Test
    public void testRabbit() {
        helloSender.sendMsg();
    }

}
