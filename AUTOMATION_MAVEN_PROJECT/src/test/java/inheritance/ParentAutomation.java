package inheritance;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentAutomation {
	public static WebDriver driver;
	
	@BeforeTest
	public void init()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMillis(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}	

	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
