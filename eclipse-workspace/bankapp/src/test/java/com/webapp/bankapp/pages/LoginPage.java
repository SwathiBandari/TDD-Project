package com.webapp.bankapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void resetidpassword() {

		driver.findElement(By.name("btnReset")).click();
	}

	public void Loginwithidpwd() throws Throwable {
		BasePage bp = new BasePage(driver);
		String loginid = bp.returnprop().getProperty("username");
		String loginpwd = bp.returnprop().getProperty("password");
		driver.findElement(By.name("uid")).sendKeys(loginid);
		driver.findElement(By.name("password")).sendKeys(loginpwd);
		driver.findElement(By.name("btnLogin")).click();

	}

}
