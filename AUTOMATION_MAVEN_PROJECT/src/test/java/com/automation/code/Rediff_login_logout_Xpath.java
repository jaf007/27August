package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_login_logout_Xpath 
{

		public static void main(String[] args) throws Exception 
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.xpath("//input[@id= 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
			driver.findElement(By.xpath("//input[@class= 'signinbtn']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class= 'rd_logout']")).click();	

	}

}
