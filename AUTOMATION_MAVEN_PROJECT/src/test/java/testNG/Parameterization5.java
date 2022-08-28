package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Parameterization5 extends Parameterization1 {

	@Test
	public void clickonsigin() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		System.out.println("The title of the login page is :"+ driver.getTitle());
	}
	
	
}
