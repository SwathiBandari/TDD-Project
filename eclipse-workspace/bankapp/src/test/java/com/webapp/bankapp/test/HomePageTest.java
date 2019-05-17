package com.webapp.bankapp.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webapp.bankapp.pages.LoginPage;
import com.webapp.bankapp.pages.NewCustomerAddPage;
import com.webapp.bankapp.utils.ExcelUtils;

public class HomePageTest extends BaseTest {

	@Test(priority = 1)
	public void clickonAddCustomer() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.resetidpassword();
		lp.Loginwithidpwd();
		NewCustomerAddPage Np = new NewCustomerAddPage(driver);
		Np.clickaddnewcustomer();
		      
	}

	
@Test(priority=2,dataProvider="getcustdata")     
public void newcustomerdata(String customername,String gender,Date dob,String address,String city,String state, int pin,double phone,String mail) {
		 
	NewCustomerAddPage Np = new NewCustomerAddPage(driver);
	Np.clickaddnewcustomer();
			
}

@DataProvider
public static Object[][] getcustdata() throws IOException {

ExcelUtils EU = new ExcelUtils();
Object[][] testdata =  EU.Readcustdata();
return testdata;
	
}
}
