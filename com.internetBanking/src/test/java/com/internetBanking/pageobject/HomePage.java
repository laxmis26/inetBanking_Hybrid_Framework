package com.internetBanking.pageobject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

WebDriver driver;
	
	@FindBy(linkText = "New Customer")
	WebElement NewCustomerlink;
	  
	@FindBy(linkText = "Edit Customer")
	WebElement EditCustomelink;
	
	public HomePage(WebDriver driver) {
	  this.driver= driver;
	  PageFactory.initElements(driver, this);
	}

	public NewCustomerPage ClickOnNewCustomeLink()
	{
		NewCustomerlink.click();
		return new NewCustomerPage(driver);
	}
	
	public EditCustomePage ClickOnEditCustomeLink()
	{
		EditCustomelink.click();
		return new EditCustomePage(driver);
	}
}
