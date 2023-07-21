package com.internetBanking.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.internetBanking.pageobject.HomePage;
import com.internetBanking.pageobject.LoginPage;
import com.internetBanking.pageobject.NewCustomerPage;
import com.internetBanking.testbase.TestBase;

public class NewCustomerTC_001 extends TestBase {

	NewCustomerPage newcustomer;
   HomePage homepage;
	
	int row=1;
//	@Test(priority = 1)
//	public void verifyNewCustomerTC_001() 
//	{
//		LoginPage login= new LoginPage(driver);
//		login.setUsername(excelDataProvider.getStringCellData("Login", 1, 0));
//		login.setPassword(excelDataProvider.getStringCellData("Login", 1, 1));
//		
//		HomePage homepage = login.clickonLoginBtn();
//		
//		 newcustomer =homepage.ClickOnNewCustomeLink();
//		String actTitle = newcustomer.verifyNewCustomerPage();
//		
//		if(actTitle.contains("New Customer"))
//		{
//			Assert.assertTrue(true);
//			System.out.println("navigated to " + driver.getTitle());
//		}
//		else
//		{
//			Assert.assertTrue(false);
//		}
//		
//		
//	}
	
//	@Test(priority = 2)
//	public void createNewCutomerTC_002()
//	{
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		newcustomer.setCustomerName("Janhvi");
//		newcustomer.selectGender("Female");
//		newcustomer.setDOB("20-6-1990");
//		newcustomer.setAddress("Shivaji nagar");
//		newcustomer.SetCity("pune");
//		newcustomer.SetState("Maharashtra");
//		newcustomer.SetPin("506456");
//		newcustomer.SetMobile("65231245");
//		newcustomer.setEmail("qwert@xyz.com");
//		newcustomer.SetPassword("yterre");
//		newcustomer.clickOnSubmit();
//		String successmsg = driver.findElement(By.xpath("//p[text()='Customer Registered Successfully!!!']")).getText();
//	   	System.out.println(successmsg);
//		
//	   	String customerID = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
//		System.out.println(customerID);//  34433
//		
//		
//		
//	}
	
	@Test(dataProvider ="createNewCustomer")
	public void createNewCustomeTC_002(String customerName , String Gender , String dob, String address, String city,
			String state, String pin, String mobile, String email, String password) throws Exception
	{
//		System.out.println(customerName + " " + Gender + " "+ dob + " " +address+ " " + city + "  " + state +
//				"  "+pin + "  "+mobile + "  "+email + "  "+password);
		LoginPage login= new LoginPage(driver);
		login.setUsername(excelDataProvider.getStringCellData("Login", 1, 0));
		login.setPassword(excelDataProvider.getStringCellData("Login", 1, 1));
		
		 homepage = login.clickonLoginBtn();
		
		 newcustomer =homepage.ClickOnNewCustomeLink();
		 
		newcustomer.setCustomerName(customerName);
		newcustomer.selectGender(Gender);
		newcustomer.setDOB(dob);
		newcustomer.setAddress(address);
		newcustomer.SetCity(city);
		newcustomer.SetState(state);
		newcustomer.SetPin(pin);
		newcustomer.SetMobile(mobile);
		newcustomer.setEmail(email);
		newcustomer.SetPassword(password);
		newcustomer.clickOnSubmit();
		String successmsg = driver.findElement(By.xpath("//p[text()='Customer Registered Successfully!!!']")).getText();
	   	System.out.println(successmsg);
		
	   	String customerID = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		System.out.println(customerID);//  49589 20668
		excelDataProvider.SetStringCelldata("newCustomer", row, customerID);
		row=row+1;
		
	//	newcustomer = homepage.ClickOnNewCustomeLink();
		
	}
	
	@DataProvider(name="createNewCustomer")
	public String[][] fetchExcelTestData()
	{
		String [][] data= excelDataProvider.getExcelsheetData("newCustomer");
		return data;
	}
	


}
