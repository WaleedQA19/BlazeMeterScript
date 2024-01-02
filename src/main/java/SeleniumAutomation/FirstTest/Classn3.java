package SeleniumAutomation.FirstTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Classn3 {
	
	@AfterClass
	public void test9()
	{
		System.out.println("Test9 Has been generated");
	}
	
	@Test
	public void test10()
	{
		System.out.println("Test10 Has been generated");
	}

	@Test
	public void test11()
	{
		System.out.println("Test11 Has been generated");
	}

	@BeforeClass
	public void test12()
	{
		System.out.println("Test12 Has been generated");
	}

}
