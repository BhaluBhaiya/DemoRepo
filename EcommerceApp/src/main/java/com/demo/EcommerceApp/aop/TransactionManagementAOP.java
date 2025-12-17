package com.demo.EcommerceApp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;


public class TransactionManagementAOP {

	@Around("@annotation(org.springframework.transaction.annotation.Transactional)")
	public Object transactionAdvice(ProceedingJoinPoint pjp) throws Throwable{
//		beginTransaction();
		try {
			Object res = pjp.proceed();
			return res;
//		commitTransaction();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
}
