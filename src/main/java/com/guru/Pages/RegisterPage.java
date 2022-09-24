package com.guru.Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	public WebDriver driver;
	public Properties prop;
	
	
	@FindBy(xpath="//h2[.='Register']")
	WebElement rigisterPageLabel;
	
	@FindBy(xpath="//input[@ng-model='FirstName']")
	WebElement fName;
	
	@FindBy(xpath="//input[@ng-model='LastName']")
	WebElement lName;
	
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	WebElement Eaddress;
	
	@FindBy(xpath="//input[@ng-model='EmailAdress']")
	WebElement eMail;
	
	@FindBy(xpath="//input[@ng-model='Phone']")
	WebElement phoneNo;
	
	@FindBy(xpath="//input[@ng-model='Male']")
	WebElement genderSelMale;
	
	@FindBy(xpath="//input[@ng-model='FeMale']")
	WebElement genderSelFemale;
	
	@FindBy(xpath="//input[@value='Cricket']")
	WebElement hobby1Cricket;
	
	@FindBy(xpath="//input[@value='Movies']")
	WebElement hobby2Movie;
	
	@FindBy(xpath="//input[@value='Hockey']")
	WebElement hobby3Hockey;
	
	@FindBy(id="msdd")
	WebElement clickOnSelectLanguage;
	
	@FindBy(id="Skills")
	WebElement clickOnSelectSkills;
	
	@FindBy(className="select2-selection select2-selection--single")
	WebElement clickOnSelectCountry;
	
	@FindBy(id="yearbox")
	WebElement clickOnSelectYearBox;
	
	@FindBy(xpath="//select[@ng-model='monthbox']")
	WebElement clickOnSelectMonthBox;
	
	@FindBy(xpath="//select[@ng-model='daybox']")
	WebElement clickOnSelectDayBox;
	
	@FindBy(xpath="//input[@ng-model='Password']")
	WebElement enterPassword;
	
	@FindBy(xpath="//input[@ng-model='CPassword']")
	WebElement enterConfirmPassword;
	
	@FindBy(id="submitbtn")
	WebElement ClickOnSubmitbtn;
	
	
	@FindBy(xpath="//button[.='Refresh']")
	WebElement clickOnRefreshBtn;
	
//	public RegisterPage() {
//		PageFactory.initElements(driver, this);
//	}
		
		public void validateRegisterTitle(){
			 driver.getTitle();	
	}
		
		public void validateRegisterPageLabel() {
			rigisterPageLabel.isDisplayed();
		}
		public void enterFirstName(String firstName) {
			fName.sendKeys(firstName);
		}
		
		public void enterLastName(String lastName) {
			lName.sendKeys(lastName);
		}
		
		public void enterAddress(String address) {
			Eaddress.sendKeys(address);
		}
		
		public void enterEmail(String mail) {
			eMail.sendKeys(mail);
		}
		
		public void EnterPhoneNo(String Pn) {
			phoneNo.sendKeys(Pn);
		}
		
		public void ClickOnGender() {
			String gendName =prop.getProperty("gender");
			if(gendName.equals("male")) {
				genderSelMale.click();
			}else if(gendName.equals("female")) {
				genderSelFemale.click();

			}
		}
		public void ClickOnFeMaleGender() {
			genderSelFemale.click();
		}
		public void ClickOnCricketCheckBox() {
			hobby1Cricket.click();
		}
		public void ClickOnMovieCheckBox() {
			hobby2Movie.click();
		}
		public void ClickOnHockeyCheckBox() {
			hobby2Movie.click();
		}
		
		public void SelectLanguage(String hindi) {
			clickOnSelectLanguage.click();
			Select LanguageDropDown = new Select(clickOnSelectLanguage);
			LanguageDropDown.selectByVisibleText(hindi);
		}
		public void SelectSkills(String skills) {
			clickOnSelectSkills.click();
			Select SkillDropDown = new Select(clickOnSelectSkills);
			SkillDropDown.selectByVisibleText(skills);
		}
		public void SelectCountry(String country) {
			clickOnSelectCountry.sendKeys(country);
		}
		public void SelectFromYearBox(String year) {
			clickOnSelectYearBox.sendKeys(year);
		}
		public void SelectFromMonthBox(String month) {
			clickOnSelectMonthBox.sendKeys(month);
		}
		public void SelectFromDayBox(String day) {
			clickOnSelectDayBox.sendKeys(day);
		}
		public void clickOnenterPasswordCheckBox(String pass) {
			enterPassword.sendKeys(pass);
		}
		public void clickOnenterconfirmPasswordCheckBox(String cpass) {
			enterConfirmPassword.sendKeys(cpass);
		}
		public void ClickOnSubmitbtncheckBox(String cpass) {
			ClickOnSubmitbtn.sendKeys(cpass);
		}
		public void clickOnRefreshBtncheckBox(String refBtn) {
			clickOnRefreshBtn.sendKeys(refBtn);
		}
}
