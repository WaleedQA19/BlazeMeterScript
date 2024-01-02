package SeleniumAutomation.FirstTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 ///System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Pc\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
	        ///WebDriver driver = new FirefoxDriver();
		System.setProperty("edge driver path", "C:\\Users\\Pc\\Downloads\\edgedriver_win64(1)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
     
	         driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	         driver.manage().window().maximize();
	         String parenthandle = driver.getWindowHandle();
	         ///System.out.println(parenthandle);
	         
	         
	         driver.findElement(By.className("whButtons")).click();
	         Set<String> handles = driver.getWindowHandles();
	         ///System.out.println(handle);
	         for (String handle : handles) 
	         {
	        	 if(!handle.equals(parenthandle)) 
	        	 {
	        		 driver.switchTo().window(handle);
	        		 driver.findElement(By.id("firstName")).sendKeys("Waleed");
	        		 Thread.sleep(4000);
	        		 
	        	 }
	        	 
	         }
	        driver.switchTo().window(parenthandle);
	        driver.findElement(By.id("name")).sendKeys("Hello");
	        Thread.sleep(4000);
	}

}
