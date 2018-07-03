package com.guru99.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Delete_Customer {

	WebDriver driver;
	
	@FindBy(name="cusid")
	WebElement inputname;
	
	@FindBy(css="input[name='submit']")
	WebElement buttonSubmit;
	
	/*@FindBy(name="cusid")
	WebElement inputID;*/
	
	public Page_Delete_Customer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Input_Customer_ID() {
		inputname.sendKeys("asdfasdf");
		
	}

	public void Click_Submit_Button() {
		buttonSubmit.click();
		
	}

	public void Click_confirm_Submission() {
		driver.switchTo().alert().accept();
		
	}
	
}
