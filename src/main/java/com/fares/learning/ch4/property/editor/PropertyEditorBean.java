package com.fares.learning.ch4.property.editor;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Pattern;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;

public class PropertyEditorBean {

	private byte[] bytes; // ByteArrayPropertyEditor
	private Character character;
	private Character character2;
	public void setCharacter2(Character character2) {
		this.character2 = character2;
	}

	private Class cls;
	private Boolean trueOrFalse;
	private List<String> stringList;
	private Date date;
	private Float floatValue;
	private Locale locale;
	private Pattern pattern;
	private Properties properties;
	private String trimString;
	private URL url;

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public void setCls(Class cls) {
		this.cls = cls;
	}

	public void setTrueOrFalse(Boolean trueOrFalse) {
		this.trueOrFalse = trueOrFalse;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setFloatValue(Float floatValue) {
		this.floatValue = floatValue;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	

	@Override
	public String toString() {
		return "PropertyEditorBean [bytes=" + Arrays.toString(bytes) + ", character=" + character + ", character2="
				+ character2 + ", cls=" + cls + ", trueOrFalse=" + trueOrFalse + ", stringList=" + stringList
				+ ", date=" + date + ", floatValue=" + floatValue + ", locale=" + locale + ", pattern=" + pattern
				+ ", properties=" + properties + ", trimString=" + trimString + ", url=" + url + "]";
	}

	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setTrimString(String trimString) {
		this.trimString = trimString;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public static class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

		@Override
		public void registerCustomEditors(PropertyEditorRegistry registry) {
			SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
			registry.registerCustomEditor(Date.class, new CustomDateEditor(dateFormatter, true));
			registry.registerCustomEditor(String.class, new StringTrimmerEditor(true));
		}

	}

}
