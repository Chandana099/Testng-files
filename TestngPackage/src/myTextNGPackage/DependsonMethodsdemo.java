package myTextNGPackage;

import org.testng.annotations.Test;

public class DependsonMethodsdemo {
	@Test
	public void startapp()
	{
		System.out.println("Start Application");
	}
	
	@Test(dependsOnMethods="startapp")
	public void login()
	{
		System.out.println("login to Application");
	}
	
	@Test(dependsOnMethods="login")
	public void logoff()
	{
		System.out.println("log out of Application");
	}



}
