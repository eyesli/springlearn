package com.levi.test;

import com.levi.test.common.lideng;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;


public class AppMain {
	public static void main(String[] args) {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		Object app = context.getBean("lidengService");
		System.out.println("lidengService = " + app);

		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

//		DefaultListBeanFactory(beanFactory);

	}

	private static void DefaultListBeanFactory(DefaultListableBeanFactory beanFactory) {
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(lideng.class);
		beanFactory.registerBeanDefinition("lideng", beanDefinition);

		System.out.println(beanFactory.getBean("lideng"));
	}

}
