package com.fares.learning.ch4.hooking.into.bean.destruction;

import java.io.File;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;

public class BeanConfigurationBasedDestructiveBean  {

	private File file;
	private String filePath;

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	
	public void init() throws Exception {
		System.out.println("BeanConfigurationBasedDestructiveBean  MethodBasedDestructiveBean");

		if (filePath == null) {
			throw new IllegalArgumentException(
					"You must specify the filePath property of" + BeanConfigurationBasedDestructiveBean.class);
		}

		this.file = new File(filePath);
		this.file.createNewFile();
		System.out.println("File exists: " + file.exists());

	}

	
	public void destroy() {
		System.out.println("BeanConfigurationBasedDestructiveBean  MethodBasedDestructiveBean");
		if (!file.delete()) {
			System.err.println("ERROR: failed  to delete file.");
		}
		System.out.println("File exists: " + file.exists());
	}

}
