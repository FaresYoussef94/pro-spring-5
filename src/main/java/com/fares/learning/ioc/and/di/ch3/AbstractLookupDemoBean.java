package com.fares.learning.ioc.and.di.ch3;

public abstract class AbstractLookupDemoBean implements DemoBean {

	public abstract Singer getMySinger();

	public void doSomething() {
		getMySinger().sing();
	}

}
