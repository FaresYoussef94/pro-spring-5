package com.fares.learning.ch4.making.your.beans.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareSinger implements BeanNameAware {

	private String name;

	@Override
	public void setBeanName(String name) {
		this.name = name;
	}
	
	public void sing() {
		System.out.println("Singer "+name+" -sing()");
	}

}
