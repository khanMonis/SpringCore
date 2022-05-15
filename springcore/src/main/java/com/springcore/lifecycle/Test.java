package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

		/*
		 * Samosa S1 = (Samosa) context.getBean("S1"); System.out.println(S1);
		 */
		// registering shutdown hook
		context.registerShutdownHook();
//		System.out.println("+++++++++++++++++++++++");
//		Pepsi p1 = (Pepsi) context.getBean("P1");
//		System.out.println(p1);
		Example E1 = (Example) context.getBean("E1");
	
		System.out.println(E1);
	}

}
