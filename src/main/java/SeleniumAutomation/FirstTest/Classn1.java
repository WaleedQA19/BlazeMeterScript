package SeleniumAutomation.FirstTest;

import org.testng.annotations.Test;

public class Classn1 {
	
 @Test(priority = 4)
	public void test1()
	{
		System.out.println("test1 function is returned");
	}
	
 @Test(priority = 3)
 public void test2()
	{
		System.out.println("test2 function is returned");
	}
	
 @Test (priority = 2)
 public void test3()
	{
		System.out.println("test3 function is returned");
	}
	
 
 @Test (priority = 1)
 public void test4()
	{
		System.out.println("test4 function is returned");
	}
	
}
