package com.crm.neogrowth.GenricUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {

	public String getproperty(String key) throws IOException {
		Properties prop= new Properties();
	FileInputStream fis = new FileInputStream("./config.properties");
	prop.load(fis);
	return prop.getProperty(key);
}}
