package org.hcl.web.library;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static String elementLocatorReader(String locatorKey) throws IOException {
		File f = new File("Configuration/ElementLocators.properties");
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(locatorKey).toString();
	}

	public static String projectConfigurationReader(String configurationKey) throws IOException {
		File f = new File("Configuration/ProjectConfiguration.properties");
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(configurationKey).toString();
	}

	
	
}
