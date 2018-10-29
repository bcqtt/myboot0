package com.lz.myboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test1")
	public String test1() {
		System.out.println("测试访问");
		
		return "success";
	}
	
}
