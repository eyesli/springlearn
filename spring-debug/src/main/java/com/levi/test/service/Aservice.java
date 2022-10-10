package com.levi.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aservice {

	@Autowired
	Bservice bservice;
}
