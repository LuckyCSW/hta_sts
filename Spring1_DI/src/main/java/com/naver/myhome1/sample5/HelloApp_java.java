package com.naver.myhome1.sample5;

public class HelloApp_java {

	public static void main(String[] args) {
		//MessageBeanImpl 객체 생성 //생성자 매개변수 값 - "Spring"
		//FileOutputter 객체 생성
		//FileOutputter 객체의 setFilePath() 호출 //설정할 값 -"out.txt"
		//MessageBeanImpl 객체의 setGreeting() 호출 //설정할 값 - "안녕하세요!"
		//MessageBeanImpl 객체의 setOutputter() 호출 //설정할 값 - FileOutputter 객체
		//MessageBeanImpl 객체의 sayHello() 호출
		MessageBeanImpl bean = new MessageBeanImpl("Spring");
		FileOutputter outputter = new FileOutputter();
		outputter.setFilePath("out.txt");
		
		bean.setGreeting("안녕하세요!");
		bean.setOutputter(outputter);
		bean.sayHello();
	}

}
