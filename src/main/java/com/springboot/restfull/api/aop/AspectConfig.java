package com.springboot.restfull.api.aop;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {
	
	Logger log=LoggerFactory.getLogger(AspectConfig.class);

	@Pointcut(value="execution(* com.springboot.restfull.api.*.*.*(..))")
	public void myPointcut() {
		
	}
	@Around("myPointcut()")
	public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {
		ObjectMapper mapper=new ObjectMapper();
		String methodName=pjp.getSignature().getName();
		String className=pjp.getTarget().getClass().toString();
		Object[] arr=pjp.getArgs();
		log.info("method invoked"+className+":"+methodName+"()"+"argument :"+mapper.writeValueAsString(arr));
		Object obj=pjp.proceed();
		log.info("method complete"+className+":"+methodName+"()"+"Response :"+mapper.writeValueAsString(obj));
		return obj;
		
	}
	
}
