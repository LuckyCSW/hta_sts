package com.naver.myhome4.common;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AfterAdvice {
	private static final Logger logger = LoggerFactory.getLogger(AfterAdvice.class);
	
	public void afterLog(JoinPoint proceeding) {
		logger.info("================================================================================");
		logger.info("[AferAdvice] : 비즈니스 로직 수행 후 동작입니다.");
		logger.info("[AfterAdvice] : "
				+ proceeding.getTarget().getClass().getName()
				+"의 "+proceeding.getSignature().getName() + "() 호출 후 입니다.");
		logger.info("================================================================================");
		
	}
}
