package com.fares.learning.ch4.property.editor;

import java.io.File;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/*
 * The following shows the implementations of the PropertyEditor interface
 */

public class ServiceMain {

	public static void main(String... strings) throws Exception {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(new ClassPathResource("app-context-ch4-property-editor.xml"));
		ctx.refresh();
		
		usingTheBuiltInEditor(ctx);
		
		ctx.close();
	}
	
	public static void usingTheBuiltInEditor(GenericXmlApplicationContext ctx) {
		PropertyEditorBean propertyEditorBean = (PropertyEditorBean) ctx.getBean("builtInSample");
		System.out.println(propertyEditorBean);
	}

}
