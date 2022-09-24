package com.guru.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru.BaseOne.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement userTextBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passTextBox;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginBtn;
	
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement loginLabel;
	
	@FindBy(xpath="//img[@alt='Guru99 Demo Sites']")
	WebElement loginLogo;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement logoutLink;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public LoginPage clickOnLogoutLink() {
		logoutLink.click();
		return new LoginPage();
	}
	
	public boolean validateLogiPageLogo() {
		return loginLogo.isDisplayed();
	}
	
	public boolean validateLoginLabel() {
		return loginLabel.isDisplayed();
	}
	
	public HomePage login(String un,String pwd) {
		userTextBox.sendKeys(un);
		passTextBox.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
}
