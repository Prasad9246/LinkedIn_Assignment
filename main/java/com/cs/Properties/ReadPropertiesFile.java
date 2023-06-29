package com.cs.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static Properties prop = new Properties();

	public static Properties readPropertyFile() {
		String fileName = System.getProperty("user.dir") + "/src/test/resources/linkedInTestData/expectedResults.properties";
		FileInputStream fis;
		try {

			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e1) {
			throw new RuntimeException("unable to find config.properties file : " + fileName);
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			throw new RuntimeException("Unable to load config.properties file : " + fileName);
		}

		return prop;
	}
}
