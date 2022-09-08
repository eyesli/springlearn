package com.levi.test.common;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class lidengFactoryBean implements FactoryBean {
	@Override
	public Object getObject() {
		return new lideng();
	}

	@Override
	public Class<?> getObjectType() {
		return lideng.class;
	}
}
