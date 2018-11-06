package com.lz.myboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/testApi")
	public String testApi() {
		System.out.println("测试访问");
		
		return "success";
	}
	
}
