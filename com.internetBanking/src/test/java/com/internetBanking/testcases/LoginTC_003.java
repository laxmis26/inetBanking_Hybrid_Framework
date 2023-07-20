package com.internetBanking.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetBanking.pageobject.LoginPage;
import com.internetBanking.testbase.TestBase;
import com.internetBanking.utility.ExcelDataProvider;



public class LoginTC_003 extends TestBase {
	
	@Test
	public void verifyLoginFunctionalityTC_003()
	{
		LoginPage login = new LoginPage(driver);
//		String username = excelDataProvider.getStringCellData(0, 1, 0);
//		String password = excelDataProvider.getStringCellData(0, 1, 1);
//		String exptitle = excelDataProvider.getStringCellData(0, 1, 2);
		
		String username = excelDataProvider.getStringCellData("Login", 1, 0);
		String password = excelDataProvider.getStringCellData("Login", 1, 1);
		String exptitle = excelDataProvider.getStringCellData("Login", 1, 2);
		
		login.setUsername(username);
		login.setPassword(password);
		login.clickonLoginBtn();
		System.out.println(driver.getTitle());
		
		
		if(exptitle.equals(driver.getTitle()))
		{
			Assert.assertTrue(true);
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login failed");
		   Assert.assertTrue(false);
		   
		}
	
	}

}
