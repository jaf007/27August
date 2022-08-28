package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Login_Logout2 {
    public static WebDriver driver;
 
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("login")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("rd_logout")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();

	}

}
