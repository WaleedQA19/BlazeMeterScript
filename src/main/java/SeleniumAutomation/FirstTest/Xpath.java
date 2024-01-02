package SeleniumAutomation.FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Pc\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://candymapper.com/");
        driver.findElement(By.xpath("//svg[@id='popup-widget37723-close-icon']")).click();
	}

}
