package com.example.aopdemo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.example.aopdemo..*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info(" Check for user access ");
        logger.info(" Intercepted Method Calls {}", joinPoint);
    };
}
