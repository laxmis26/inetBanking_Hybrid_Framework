package com.internetBanking.testcases;

import org.testng.annotations.Test;

import com.internetBanking.pageobject.HomePage;
import com.internetBanking.pageobject.LoginPage;
import com.internetBanking.testbase.TestBase;

public class HomeTC_001 extends TestBase {

	@Test
	public void navigateTonewCustomerTC_001()
	{
		LoginPage login = new LoginPage(driver);
	
		String username = excelDataProvider.getStringCellData("Login", 1, 0);
		String password = excelDataProvider.getStringCellData("Login", 1, 1);
		
		login.setUsername(username);
		login.setPassword(password);
		
		HomePage homepage = login.clickonLoginBtn();
		homepage.ClickOnNewCustomeLink();
		
		System.out.println(driver.getTitle());
		
	}
}
