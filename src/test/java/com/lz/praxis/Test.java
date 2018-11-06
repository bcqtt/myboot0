package com.lz.praxis;

import java.util.List;

import com.google.common.collect.Lists;

public class Test {
	
	public static void main(String[] args) {
//		for(int i=0;i<10000;i++) {
//			if(i%2==0) {
//				System.out.println(0);
//			}else {
//				System.out.println(1);
//			}
//			
//		}
		
		List<String> list = Lists.newArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.removeIf(key -> {
			boolean result = false;
			if("1".equals(key)) {
				result = true;
			}
			return result;
		});
		
		list.stream().forEach(System.out::println);
		
		
	}

}
