package com.fares.learning.ch4.factory.beans;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean
	public MessageDigestFactoryBean shaDigest() {
		MessageDigestFactoryBean digest = new MessageDigestFactoryBean();
		digest.setAlgorithmName("SHA1");
		return digest;
	}

	@Bean
	public MessageDigestFactoryBean defaultDigest() {
		return new MessageDigestFactoryBean();
	}

	@Bean
	public MessageDigester digester() throws Exception {
		MessageDigester messageDigester = new MessageDigester();
		messageDigester.setDigest1(shaDigest().getObject());
		messageDigester.setDigest2(defaultDigest().getObject());
		return messageDigester;
	}

}
