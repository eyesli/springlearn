package com.levi.test.service;

import com.levi.test.common.Lideng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class LidengService {
	@Autowired
	Lideng lideng;
	@Transactional
	public void test(){
		System.out.println("true = " + true);
	}


}
