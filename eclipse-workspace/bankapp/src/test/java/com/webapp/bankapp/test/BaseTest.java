package com.webapp.bankapp.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.webapp.bankapp.pages.BasePage;

public class BaseTest {
	protected WebDriver driver;

	@BeforeMethod
	public void Setup() throws IOException {

		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		BasePage bp = new BasePage(driver);
		String bankpage = bp.returnprop().getProperty("url");
		driver.get(bankpage);
		}

	@AfterSuite
	public void cleanUp() {
		driver.quit();
	}
}
