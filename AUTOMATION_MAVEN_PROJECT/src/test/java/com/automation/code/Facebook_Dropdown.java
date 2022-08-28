package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Dropdown {
	
	public static WebDriver driver;
	public static Select select;
	
	@Test
	public void checkDOB() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Panda");
		driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Selenium@123");
		
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Sep");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("28");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("2000");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[contains(text(), 'Male')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
		
		
	}
	

}
