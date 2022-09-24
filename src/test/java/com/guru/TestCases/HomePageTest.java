package com.guru.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru.BaseOne.TestBase;
import com.guru.Pages.EditCustomerPage;
import com.guru.Pages.HomePage;
import com.guru.Pages.LoginPage;
import com.guru.Pages.NewCustomerPage;

public class HomePageTest extends TestBase{
	public LoginPage loginPage;
	public HomePage homePage;
	public NewCustomerPage newCustomer;
	public EditCustomerPage editCustomer;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage=new HomePage();
	}
	
	@Test(priority=1)
	public void ValidateHomePageTitleTest() {
		logger.info("ValidateHomePageTitleTest passed");
		String st = homePage.validateHomePageTite();
		System.out.println(st);
		Assert.assertEquals(st, "Guru99 Bank Manager HomePage","HomePageTitle is mismatch");
	}
	
	@Test(priority=2)
	public void validateHomePageWelcomeLabel() {
		logger.info("validateHomePageWelcomeLabel passed");
		boolean tr=homePage.vaidateHomePageLabel();
		System.out.println(tr);
	}
	
	@Test (priority=3)
	public void clickOnNewCustomerTest() {
		homePage.clickOnNewCustomer();
	}
	
	@Test (priority=4)
	public void clickOnEditCustomerTest() {
		homePage.clickOnEditCustomer();
	}
	
	@AfterMethod()
	public void tearUp(){
		driver.quit();
		
	}

}
