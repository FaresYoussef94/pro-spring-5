package com.fares.learning.ch4.hooking.into.bean.destruction;

import java.io.File;

import org.springframework.beans.factory.InitializingBean;

public class MethodBasedDestructiveBean implements InitializingBean {

	private File file;
	private String filePath;

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing  MethodBasedDestructiveBean");

		if (filePath == null) {
			throw new IllegalArgumentException(
					"You must specify the filePath property of" + MethodBasedDestructiveBean.class);
		}

		this.file = new File(filePath);
		this.file.createNewFile();
		System.out.println("File exists: " + file.exists());

	}

	public void destroy() {
		System.out.println("Destroying  MethodBasedDestructiveBean");
		if (!file.delete()) {
			System.err.println("ERROR: failed  to delete file.");
		}
		System.out.println("File exists: " + file.exists());
	}

}
