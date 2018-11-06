package com.lz.myboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

@RestController
public class TestController {

	@RequestMapping("/testApi")
	public String testApi() {
		System.out.println("测试访问");
		
		return "success";
	}
	
}
