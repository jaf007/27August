package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Login_Logout {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.id("u_0_5_/S")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("a8c37x1j ms05siws l3qrxjdp b7h9ocf4 p4j9feef jnigpg78 odw8uiq3")).click();
		

	}

}
