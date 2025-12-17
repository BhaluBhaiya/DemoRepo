package com.demo.EcommerceApp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Pointcut("execution(* com.demo.EcommerceApp.controller.*.*(..))")
	public void controllerLayer() {
		
	}
	@Pointcut("execution(* com.demo.EcommerceApp.services.*.*(..))")
	public void serviceLayer() {
		
	}
	@Pointcut("execution(* com.demo.EcommerceApp.dao.*.*(..))")
	public void daoLayer() {
		
	}
	@Pointcut("execution(* com.demo.EcommerceApp.entities.*.*(..))")
	public void entitiesLayer() {
		
	}
	@Pointcut("execution(* com.demo.EcommerceApp.repositries.*.*(..))")
	public void repositoriesLayer() {
		
	}
	@Pointcut("execution(* com.demo.EcommerceApp.exceptions.*.*(..))")
	public void exceptionsLayer() {
		
	}
	
	
	
	@Before("controllerLayer() || serviceLayer() || daoLayer() || entitiesLayer() || repositoriesLayer() || exceptionsLayer()")
	public void beforeEachMethod(JoinPoint jp) {
		logger.info("Start ->{}",jp.getSignature());
	}
	
	@AfterReturning(pointcut = "execution(* com.demo.EcommerceApp.controller.*.*(..))", returning = "result")
	public void afterReturningMethod(JoinPoint jp, Object result) {
		logger.info("Success ->{}",jp.getSignature());
		logger.info("Result ->{}",result);
		
	}
	
	@AfterThrowing(pointcut = "execution(* com.demo.EcommerceApp.controller.*.*(..))", throwing = "ex")
	public void afterException(JoinPoint jp, Exception ex) {
		logger.error("Error ->{}",jp.getSignature());
		logger.error("Error ->{}",ex.getMessage());
	}
	
	
	@After("execution(* com.demo.EcommerceApp.controller.*.*(..))")
	public void logAfter(JoinPoint jp) {
		logger.info("End ->{}",jp.getSignature());
	}
	
	
}
