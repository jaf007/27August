package java_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
public class Automation_webrowser {

	public static  WebDriver driver;
	public static void main(String[] args) throws Exception {
	 //System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\JAVA\\Browser Drivers\\driver.exe");
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.ca/");
     Thread.sleep(5000);
     driver.quit();
	}

}
