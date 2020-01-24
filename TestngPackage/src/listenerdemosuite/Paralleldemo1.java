package listenerdemosuite;

import org.testng.annotations.Test;

public class Paralleldemo1 {
	@Test(groups=  "smoke" )
	public void test1()
	{
		System.out.println("First smoke Testing");
	}
	
	@Test(groups=  "smoke" )
	public void test2()
	{
		System.out.println("Second smoke Testing");
	}
	
	@Test(groups = { "smoke" })
	public void test3()
	{
		System.out.println("Third smoke Testing");
	}
	
	@Test(groups= { "regression" })
	public void test4()
	{
		System.out.println("First regression Testing");
	}


}
