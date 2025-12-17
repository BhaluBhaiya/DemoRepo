package com.demo.SpringLogin.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.demo.SpringApp.controller.EmployeeController;

@Aspect
@Component
public class LoggingAspect {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Before("execution(* com.demo.SpringLogin.services.*.*(..))")
	public void beforeEachMethod(JoinPoint joinPoint) {
		logger.info(joinPoint.getSignature().getName());
		logger.info("Entering method:{}",joinPoint.getSignature());
	}
}
