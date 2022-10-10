package com.levi.test.common;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class lidengFactoryBean implements FactoryBean {
	@Override
	public Object getObject() {
		return new Lideng();
	}

	@Override
	public Class<?> getObjectType() {
		return Lideng.class;
	}
}
