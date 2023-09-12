package com.naver.myhome2.sample2;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("m2")
public class MessageMultiple {
	private MessageBean messagebean;
	
	@Autowired
	public void setBean(MessageBean messagebean) {
		this.messagebean = messagebean;
	}
	
	public MessageMultiple() {
		System.out.println("MessageMultiple 생성자입니다.");
	}
	
	public void print() {
		messagebean.sayHello("Spring");
	}
	
	//객체를 생성한 후에 init-method 속성으로 지정된 이 메소드를 호출합니다.
	@PostConstruct //init-method="initMethod"에 해당하는 annotation
	public void initMethod() {
		System.out.println("MessageMultiple의 init-method()를 실행합니다.");
	}
}
