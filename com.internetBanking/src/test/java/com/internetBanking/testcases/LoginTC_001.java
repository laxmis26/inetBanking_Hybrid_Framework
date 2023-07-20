package com.internetBanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetBanking.pageobject.LoginPage;
import com.internetBanking.testbase.TestBase;

public class LoginTC_001 extends TestBase {

//	@Test
//	public void loginTC_001()
//	{
//		driver.findElement(By.name("uid")).sendKeys("mngr511658");
//		driver.findElement(By.name("password")).sendKeys("gAdejyz");
//		
//		driver.findElement(By.name("btnLogin")).click();
//		
//		String actTitle = driver.getTitle();
//		System.out.println(actTitle);
//		
//	}
	
	
	@Test
	public void verifyLoginPageTitleTC_001()
	{
		String expTitle = "Guru99 Bank Home Page";
		String actTitle = driver.getTitle();
		
		System.out.println(actTitle);
	
		
		if(expTitle.equals(actTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	

	
}

