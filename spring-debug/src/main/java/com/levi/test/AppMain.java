package com.levi.test;

import com.levi.test.common.Lideng;
import com.levi.test.service.LidengService;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@EnableAspectJAutoProxy
public class AppMain {
	public static void main(String[] args) {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		LidengService lidengService = context.getBean("lidengService", LidengService.class);
		lidengService.test();

		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

//		DefaultListBeanFactory(beanFactory);

	}

	private static void DefaultListBeanFactory(DefaultListableBeanFactory beanFactory) {
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(Lideng.class);
		beanFactory.registerBeanDefinition("lideng", beanDefinition);

		System.out.println(beanFactory.getBean("lideng"));
	}

}
