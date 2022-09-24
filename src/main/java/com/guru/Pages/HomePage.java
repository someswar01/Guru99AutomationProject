package com.guru.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru.BaseOne.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//tr[@class='heading3']/parent::tbody/tr[2]/td/marquee")
	WebElement homePageWelcomeLabel;

	@FindBy(xpath="//a[.='New Customer']")
	WebElement newCustomerLink;
	
	@FindBy(xpath="//a[.='Edit Customer']")
	WebElement editCustomerLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTite() {
		return driver.getTitle();
	}
	
	public boolean vaidateHomePageLabel() {
		return homePageWelcomeLabel.isDisplayed();
	}
	
	public NewCustomerPage clickOnNewCustomer() {
		newCustomerLink.click();
		return new NewCustomerPage();
	}
	
	public EditCustomerPage clickOnEditCustomer() {
		editCustomerLink.click();
		return new EditCustomerPage();
	}
}
