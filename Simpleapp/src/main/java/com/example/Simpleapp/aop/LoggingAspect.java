package com.example.Simpleapp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LoggingAspect {
	
	
	private static final Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
	
    @Before("execution(* com.example.Simpleapp.service.*.*(..))")
	public void beforeEachMethod(JoinPoint joinPoint) {
//    	logger.info(joinPoint.getSignature().getName());
    	logger.info("Entering method: {}",joinPoint.getSignature());
    	 }
	
    @After("execution(* com.example.Simpleapp.service.*.*(..))")
	public void afterEachMethod(JoinPoint joinPoint) {
//    	logger.info(joinPoint.getSignature().getName());
    	logger.info(joinPoint.getSignature().getName());
    }
    
    @AfterReturning("execution(* com.example.Simpleapp.service.*.*(..))")
	public void afterReturningEachMethod(JoinPoint joinPoint) {
//    	logger.info(joinPoint.getSignature().getName());
    	logger.info("Exiting method: {}",joinPoint.getSignature());
    }
    
    @AfterThrowing(value="execution(* com.example.Simpleapp.service.*.*(..))" ,throwing="ex")
    public void afterExceptionThrown(JoinPoint joinPoint,Exception ex) {
//    	logger.info(joinPoint.getSignature().getName());
    	logger.error("Service Exception : {}, message={}",joinPoint.getSignature(),ex.getMessage());
    }
}
