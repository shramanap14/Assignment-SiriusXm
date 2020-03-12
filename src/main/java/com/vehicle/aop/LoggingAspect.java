package com.vehicle.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	@Before("execution(* com.vehicle.service.impl.VehicleServiceImpl.*(..))")
    public void logBeforeAllMethods(JoinPoint joinPoint) 
    {
		logger.info("Before calling the method : " + joinPoint.getSignature().getName());
    }

	@After("execution(* com.vehicle.service.impl.VehicleServiceImpl.*(..))")
    public void logAfterAllMethods(JoinPoint joinPoint) 
    {
		logger.info("After calling the method : " + joinPoint.getSignature().getName());
    }
}
