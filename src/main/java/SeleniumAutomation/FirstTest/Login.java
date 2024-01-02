package SeleniumAutomation.FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
@Test
	public void sitelogin() 
	{
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Pc\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.saucedemo.com/");
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
	}
	
}
