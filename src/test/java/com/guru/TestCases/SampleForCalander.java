package com.guru.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru.Pages.ExcelDataSupplier;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleForCalander {

	public static WebDriver driver;
	@Test(dataProvider="getData",dataProviderClass=ExcelDataSupplier.class)
	public void LaunchApplication(String userName,String password) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.getCurrentUrl();
		driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]")).click();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}
		 
//		driver.getCurrentUrl();
//		driver.getWindowHandle();
//		driver.findElement(By.xpath("//a[.='New Customer']")).click();
//		driver.getCurrentUrl();
//		String mainWindowHandle= driver.getWindowHandle();
//		String subWinHandle=null;
//		
//		Set<String> allHandle=driver.getWindowHandles();
//		Iterator<String>iterator=	allHandle.iterator();
//		while(iterator.hasNext()) {
//			subWinHandle = iterator.next();
//		}
//		driver.switchTo().window(subWinHandle);
//		driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span")).click();
//		//driver.switchTo().window(mainWindowHandle);
		
//		driver.switchTo().frame(driver.findElement(By.id("ad_iframe")));
//		driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span")).click();
//		driver.switchTo().defaultContent();
		
	}
	
	public boolean isAlertPresent() {
		try {
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
		return false;
		}
	}

}
