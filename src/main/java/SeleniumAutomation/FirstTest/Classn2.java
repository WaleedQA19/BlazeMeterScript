package SeleniumAutomation.FirstTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class Classn2 {
		
	@AfterMethod
		public void test5()
		{
			System.out.println("Test5 Has been generated");
		}
	
	@Test
	public void test6()
	{
		System.out.println("Test6 Has been generated");
	
	}

	@Test
	public void test7()
	
	{
		System.out.println("Test7 Has been generated");
		
    }
	
	@BeforeMethod
	public void test8()
	
	{
		System.out.println("Test8 Has been generated");
		
    }

}