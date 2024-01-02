package SeleniumAutomation.FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Lecture3 {

	public static void main(String[] args) {
		
		/// Initialize the Gecko Driver
		
        System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Pc\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		
		/// Initialize the Edge Driver
		
		///System.setProperty("edge driver path", "C:\\Users\\Pc\\Downloads\\edgedriver_win64(1)\\msedgedriver.exe");
        ///WebDriver driver = new EdgeDriver();
        
         
         driver.get("https://www.linkedin.com/home");
         ///driver.close();
         
        WebElement name = driver.findElement(By.id("session_key"));       
        name.sendKeys("waleedbhinder20@gmail.com");
        WebElement pwd = driver.findElement(By.id("session_password"));
        pwd.sendKeys("National$1");
        
	}

}
