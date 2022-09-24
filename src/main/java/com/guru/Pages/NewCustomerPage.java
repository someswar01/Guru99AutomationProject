package com.guru.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru.BaseOne.TestBase;

public class NewCustomerPage extends TestBase{
	
	@FindBy(xpath="//p[.='Add New Customer']")
	WebElement newCustomerPageLabel;
	
	
	public NewCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateNewCustomerPageTitle() {
		return driver.getTitle();
	}
	
	public void enterCustomeDetails() {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Someswar");
		driver.findElement(By.xpath("//td[.='Gender']/following-sibling::td/input")).click();
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("15031998");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Hydrabad-kachiguda");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Hydrabad");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Telangana");
		driver.findElement(By.xpath("//input[@name='pin']")).sendKeys("518380");
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9876518380");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("someshgona@123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shgona@123");
		driver.findElement(By.xpath("//input[@name='sub']")).click();
		
	}
	
//	public void enterGender() {
//		driver.findElement(By.xpath("//td[.='Gender']/following-sibling::td/input")).click();
//	}
//	
//	public void enterDOB() {
//		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("15031998");	
//	}
//	
//	public void enterAddress() {
//		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Hydrabad-kachiguda");
//	}
//	
//	public void enterCity() {
//		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Hydrabad");
//	}
//	
//	public void enterState() {
//		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Telangana");
//	}
//	
//	public void enterPin() {
//		driver.findElement(By.xpath("//input[@name='pin']")).sendKeys("518380");
//	}
//	
//	public void enterMobileNum() {
//		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9876518380");
//	}
//	public void enterEmail() {
//		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("someshgona@123");
//	}
//	public void enterPassword() {
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shgona@123");
//	}
//	public void entersubmit() {
//		driver.findElement(By.xpath("//input[@name='sub']")).sendKeys("Shgona@123");
//	}

}
