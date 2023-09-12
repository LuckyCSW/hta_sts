package com.naver.myhome1.sample4;

public class HelloApp_java {
	public static void main(String[] args) {
		
		MessageBeanImpl bean = new MessageBeanImpl("Spring"); //생성자 주입
		bean.setGreeting("안녕하세요!");//setter DI
		bean.sayHello();
	}
}
