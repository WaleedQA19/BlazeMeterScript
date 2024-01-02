package SeleniumAutomation.FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Pc\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=33412D9DBB5CF4FF433188A834D0100C?signonForm");
        
        driver.findElement(By.id("stripes--1199411823")).sendKeys("test-waleed");
        driver.findElement(By.name("username")).sendKeys("National$1");
        driver.findElement(By.linkText("Register Now!")).click();
        driver.findElement(By.partialLinkText("Sign")).click();
        driver.findElement(By.tagName("a")).click();
        driver.findElement(By.className("x x-fonts-league-spartan x-fonts-montserrat"));
        
        

	}

}
