package SeleniumAutomation.FirstTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Classn4 {
	
    @AfterSuite
	public void test13()
	{
		System.out.println("Test13 Has been generated");
	}
    
    @BeforeSuite
    public void test14()
	{
		System.out.println("Test14 Has been generated");
	}
}
