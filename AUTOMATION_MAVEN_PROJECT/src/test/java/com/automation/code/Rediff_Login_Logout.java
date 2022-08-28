package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Login_Logout 
{

	public static void main(String[] args) throws Exception
	{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input.signinbtn")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("a.rd_logout")).click();	

		}

	

}


