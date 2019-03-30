package com.fares.learning.ioc.and.di.ch3;

public class StandardLookupDemoBean implements DemoBean {

	private Singer mySinger;

	public void setSinger(Singer mySinger) {
		this.mySinger = mySinger;
	}

	public Singer getMySinger() {
		return this.mySinger;
	}

	public void doSomething() {
		mySinger.sing();
	}

}
