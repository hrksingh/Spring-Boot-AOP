package com.atrium;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Greetings {

	//@Before("execution(void sayName())")
	@Before("sayNamePointCut()")
	void goodMorning() {
		System.out.println("Hi Good Morning!!!");
	}
	
	//@After("execution(void sayName())")
	@After("sayNamePointCut()")
	void goodNight() {
		System.out.println("Bye Good Night!!!");
	}
	
	@Pointcut("execution(* sayName() )")
	void sayNamePointCut() {
		
	}
}
