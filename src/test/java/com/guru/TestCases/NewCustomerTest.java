package com.guru.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru.BaseOne.TestBase;
import com.guru.Pages.HomePage;
import com.guru.Pages.LoginPage;
import com.guru.Pages.NewCustomerPage;

public class NewCustomerTest extends TestBase{
	public LoginPage loginPage;
	public HomePage homePage;
	public NewCustomerPage newcustomer;
	
	public NewCustomerTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage=new HomePage();
		newcustomer=homePage.clickOnNewCustomer();
		//newcustomer.dismisPopupMsg();
		newcustomer = new NewCustomerPage();
	}
	@Test
	public void validateNewCustomerPageTitleTest() {
		String title= newcustomer.validateNewCustomerPageTitle();
		Assert.assertEquals(title, "Guru99 Bank New Customer Entry Page","Title mismatch");
	}
	@Test 
	public void validateNewCustomerDetailsTest() {
		newcustomer.enterCustomeDetails();
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	

}
