package com.webapp.bankapp.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public Properties returnprop() throws IOException {
		FileInputStream fis = new FileInputStream("resources/Datasource.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}
	
	
}
