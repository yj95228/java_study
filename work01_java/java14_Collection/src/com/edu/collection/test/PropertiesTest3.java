package com.edu.collection.test;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest3 {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		Enumeration en = p.propertyNames();
		
		while(en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String value = p.getProperty(key);
			System.out.println(key+"================"+value);
		}
	}

}
