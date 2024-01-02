package SeleniumAutomation.FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AccessFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("edge driver path", "C:\\Users\\Pc\\Downloads\\edgedriver_win64(1)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
     
	         driver.get("http://blogpendingtasks.blogspot.com/");
	         
	         driver.findElement(By.id("navbar-iframe")).click();
	         driver.findElement(By.id("navbar-iframe")).sendKeys("QAFox Side widgets");
	       
	}

}
