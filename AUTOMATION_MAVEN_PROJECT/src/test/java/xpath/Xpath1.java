package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath1 {
	public static WebDriver driver;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@id ='login1' and @name ='login']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class ='signinbtn'and @name= 'proceed']")).click();
		driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		

	}

}
