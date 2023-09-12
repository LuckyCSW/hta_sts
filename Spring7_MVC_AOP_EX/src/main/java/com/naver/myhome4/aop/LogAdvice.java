package com.naver.myhome4.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogAdvice {
	private static final Logger logger = LoggerFactory.getLogger(LogAdvice.class);
	
	public void beforeLog() {
		logger.info("[LogAdvice : 공통메소드 입니다.]");
	}
}
