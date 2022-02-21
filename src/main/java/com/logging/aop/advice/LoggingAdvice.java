package com.logging.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class LoggingAdvice {
	Logger log=LoggerFactory.getLogger(LoggingAdvice.class);
	
	@Pointcut(value="execution(* com.logging.aop.*.*.*(..))")
	public void myPointCut() {
		
	}

	@Around("myPointCut()")
	public Object applictionLogger(ProceedingJoinPoint pjp) throws Throwable {
		ObjectMapper mapper=new ObjectMapper();
		String methodName=pjp.getSignature().getName();
		String className=pjp.getSignature().getClass().toString();
		Object[] array= pjp.getArgs();
		log.info("class::"+className+" method::"+methodName+" parameters::"+mapper.writeValueAsString(array));
		
		Object obj=pjp.proceed();
		
		return obj;
	}
}
