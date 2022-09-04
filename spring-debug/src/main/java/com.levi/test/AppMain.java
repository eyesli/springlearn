package com.levi.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppMain {
	public static void main(String[] args) {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		Object app = context.getBean("app");
		System.out.println("app = " + app);

	}

}
