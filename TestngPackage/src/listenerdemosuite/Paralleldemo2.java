package listenerdemosuite;

import org.testng.annotations.Test;

public class Paralleldemo2 {
	@Test(groups=  "regression" )
	public void test1()
	{
		System.out.println("Second regression Testing");
	}
	
	@Test(groups=  "regression" )
	public void test2()
	{
		System.out.println("Third regression Testing");
	}
	
	@Test(groups = { "smoke" })
	public void test3()
	{
		System.out.println("Fourth smoke Testing");
	}
	
	@Test(groups= { "regression" })
	public void test4()
	{
		System.out.println("Fourth regression Testing");
	}


}
