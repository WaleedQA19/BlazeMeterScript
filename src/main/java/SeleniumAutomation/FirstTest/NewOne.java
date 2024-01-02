package SeleniumAutomation.FirstTest;

import org.testng.annotations.Test;

public class NewOne {
@Test(groups ="New-Group")
	public void test()
	
	{
		System.out.println("First test case");
	}
	
    public void test1()
	
	{
		System.out.println("Second test case");
	}
	@Test(groups = "group1")
    public void test2()

{
	System.out.println("Group test case has been generated");
}
	@Test(groups = "group1")
   public void test3()

{
	System.out.println("Third test case");
}

}
