package com.internetBanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetBanking.pageobject.LoginPage;
import com.internetBanking.testbase.TestBase;

public class LoginTC_002 extends TestBase {
	

	@Test
	public void verifyLoginFunctionalityTC_002()
	{
		LoginPage login= new LoginPage(driver);
		login.setUsername(configDataProvider.getUsername());
		login.setPassword(configDataProvider.getPassword());
		login.clickonLoginBtn();
		System.out.println(driver.getTitle());
		
		String expTitle = "Guru99 Bank Manager HomePage";
		String actTitle = driver.getTitle();
//		if(expTitle.equals(actTitle))
//		{
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//		}
		
		Assert.assertEquals(actTitle, expTitle, "act browser doesn't matched with expected browser");
		
	}

}
