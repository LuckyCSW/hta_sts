package com.naver.myhome1.sample5;

import org.springframework.context.support.GenericXmlApplicationContext;
//스프링을 이용하여 클래스 사이의 결합상태를 느슨하게 만듭니다.
public class HelloApp {

   public static void main(String[] args) {
      
      GenericXmlApplicationContext ctx
      = new GenericXmlApplicationContext("com/naver/myhome1/sample5/applicationContext.xml");
      
      MessageBean bean = (MessageBean) ctx.getBean("m3");
      System.out.println("=================getBean() 전 ==================");
      
      
      bean.sayHello();
      ctx.close();
      
      //자동 새로 고침
      //Window > Preferences > General
      //	   > Workspace > Refresh using native hooks and polling
   }
}