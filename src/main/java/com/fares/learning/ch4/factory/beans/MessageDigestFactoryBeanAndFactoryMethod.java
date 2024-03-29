package com.fares.learning.ch4.factory.beans;

import java.security.MessageDigest;

public class MessageDigestFactoryBeanAndFactoryMethod {

	private String algorithmName = "MD5";

	public MessageDigest createInstance() throws Exception {
		return MessageDigest.getInstance(algorithmName);
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

}
