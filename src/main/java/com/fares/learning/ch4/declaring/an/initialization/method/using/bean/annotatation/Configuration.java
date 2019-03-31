package com.fares.learning.ch4.declaring.an.initialization.method.using.bean.annotatation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Lazy
	@Bean(initMethod="init")
	BeanConfigurationSinger singerOne() {
		BeanConfigurationSinger singerOne = new BeanConfigurationSinger();
		singerOne.setName("John Mayer");
        singerOne.setAge(39);
        return  singerOne;
	}
	
	@Lazy
	@Bean(initMethod="init")
	BeanConfigurationSinger singerTwo() {
		BeanConfigurationSinger singerTwo = new BeanConfigurationSinger();
		singerTwo.setAge(72);
        return  singerTwo;
	}
	
	@Lazy
    @Bean(initMethod = "init")
	BeanConfigurationSinger singerThree()  {
		BeanConfigurationSinger singerThree = new BeanConfigurationSinger();
            singerThree.setName("John Butler");
            return singerThree;
}
	
}
