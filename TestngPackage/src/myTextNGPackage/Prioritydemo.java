package myTextNGPackage;

import org.testng.annotations.Test;

public class Prioritydemo {
	@Test
	public void startapp()
	{
		System.out.println("Start Application");
	}
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("login to Application");
	}
	
	@Test(priority=2)
	public void logoff()
	{
		System.out.println("log out of Application");
	}


}
