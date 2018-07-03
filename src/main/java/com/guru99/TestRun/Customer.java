package com.guru99.TestRun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99.Pages.Page_Delete_Customer;

public class Customer {

	WebDriver driver = new ChromeDriver();
	
	String baseUrl = "http://demo.guru99.com/test/delete_customer.php";
	Page_Delete_Customer customerDeletePage = new Page_Delete_Customer(driver);
	
	
	
	
	
	@Test
	public void Delete_Customer() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		customerDeletePage.Input_Customer_ID();
		Thread.sleep(3000);
		customerDeletePage.Click_Submit_Button();
		Thread.sleep(3000);
		customerDeletePage.Click_confirm_Submission();
		Thread.sleep(3000);
		driver.close();
	}

}
