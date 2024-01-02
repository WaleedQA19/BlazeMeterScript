package SeleniumAutomation.FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scripting {

	public static void Checkout() {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Pc\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.saucedemo.com/");
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.className("inventory_item_img")).click();
        	
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        
        driver.findElement(By.id("first-name")).sendKeys("Waleed");
        driver.findElement(By.id("last-name")).sendKeys("Bhinder");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("5876");
        
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        driver.findElement(By.id("back-to-products")).click();
        

	}

}
