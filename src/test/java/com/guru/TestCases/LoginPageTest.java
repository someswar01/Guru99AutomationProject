package com.guru.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru.BaseOne.TestBase;
import com.guru.Pages.ExcelDataSupplier;
import com.guru.Pages.HomePage;
import com.guru.Pages.LoginPage;

public class LoginPageTest extends TestBase {
	public LoginPage loginPage;
	public HomePage homepage;
	
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
	}
	
	@Test(priority=1)
	public void ValidateTitleTest() {
		String st = loginPage.ValidateLoginPageTitle();
		System.out.println(st);
		Assert.assertEquals(st, "Guru99 Bank Home Page","mismatch title");
		//logger.info("ValidateTitleTest is passed");
	}
	
	@Test(priority=2)
	public void ValidateLoginLogoTest() {
	boolean st =loginPage.validateLogiPageLogo();
	Assert.assertTrue(st);
	logger.info("ValidateLoginLogoTest is passed");
	}
	
	@Test(priority=3)
	public void ValidateLoginLabelTest() {
	boolean label =	loginPage.validateLoginLabel();
	System.out.println(label);
	Assert.assertTrue(label);
	logger.info("ValidateLoginLabelTest is passed");
	}
	
	@Test(priority=4)
	public void login() {
		 loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		 logger.info("username and password is entered and login is passed");
	}
	
//	@Test(priority=4,dataProvider="getData",dataProviderClass=ExcelDataSupplier.class)
//	public void login(String username,String password) {
//		 loginPage.login(username,password);	
//		 if(isAlertPresent()==true) {
//				driver.switchTo().alert().accept();
//				driver.switchTo().defaultContent();
//				Assert.assertTrue(false);
//			}
//			else {
//				Assert.assertTrue(true);
//				//driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a")).click();
//				loginPage.clickOnLogoutLink();
//				driver.switchTo().alert().accept();
//				driver.switchTo().defaultContent();
//				}
//	}
//		 
	
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
