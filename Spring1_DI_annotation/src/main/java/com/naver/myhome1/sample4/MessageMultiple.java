package com.naver.myhome1.sample4;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class MessageMultiple {
	private MessageBean messagebean;
	
	//해당 타입에 할당할 수 있는 빈 객체를 찾아서 자동 주입됩니다.
	//반드시 주입할 의존 객체가 존재해야 합니다.
	@Resource(name="m")
	public void setBean(MessageBean messagebean) {
		this.messagebean = messagebean;
	}
	
	public MessageMultiple() {
		System.out.println("MessageMultiple 생성자입니다.");
	}
	
	public void print() {
		messagebean.sayHello("Spring");
	}
}
