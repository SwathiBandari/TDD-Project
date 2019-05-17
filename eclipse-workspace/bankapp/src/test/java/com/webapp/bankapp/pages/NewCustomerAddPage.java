package com.webapp.bankapp.pages;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCustomerAddPage extends LoginPage{
	
	public NewCustomerAddPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickaddnewcustomer() {
		
	driver.findElement(By.xpath(".//ul[@class='menusubnav']/li[2]/a")).click();
	
}
	public void addnewcust(String customername,String gender,String dob,String address,String city,String state, String pin,String phone,String mail) {
		driver.findElement(By.name("name")).sendKeys(customername);
		List<WebElement> Genders = driver.findElements(By.xpath(".//table/tbody/tr[5]"));  
		if(gender=="female" ) {
			Genders.get(1).click();
		}
		else
		Genders.get(0).click();
		driver.findElement(By.cssSelector("input[name='dob']")).sendKeys(dob);
		driver.findElement(By.name("addr")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);;
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("pinno")).sendKeys(pin);;
		driver.findElement(By.name("telephoneno")).sendKeys(phone);
		driver.findElement(By.name("emailid")).sendKeys(mail);
		driver.findElement(By.name("sub")).click();
		
	}

	}  