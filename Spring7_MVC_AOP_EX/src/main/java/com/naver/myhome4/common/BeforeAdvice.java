package com.naver.myhome4.common;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeforeAdvice {
	private static final Logger logger = LoggerFactory.getLogger(BeforeAdvice.class);
	
	public void beforeLog(JoinPoint proceeding) {
		logger.info("=============================================");
		logger.info("[BeforeAdvice] : 비즈니스 로직 수행 전 동작입니다.");
		logger.info("[BeforeAdvice] : " + proceeding.getTarget().getClass().getName()
				+"의 "+proceeding.getSignature().getName() + "() 호출합니다.");
		logger.info("=============================================");
		
	}
}
