package com.naver.myhome1.sample5_2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ReadMain2 {
	public static void main(String[] args) {
	      //1. Spring 컨테이너를 구동합니다.
	      GenericXmlApplicationContext ctx
	      = new GenericXmlApplicationContext("com/naver/myhome1/sample5_2/applicationContext2.xml");
	      
	      //2. Spring 컨테이너로부터 빈의 아이디가 "readTest2"인 bean을 가져옵니다.
	      ReadTest2 rt = (ReadTest2) ctx.getBean("readTest2");
	      
	      //3. 메소드 실행합니다.
	        rt.print();
	      //4. Spring 컨테이너를 종료합니다.
	      ctx.close();
	   }
}
