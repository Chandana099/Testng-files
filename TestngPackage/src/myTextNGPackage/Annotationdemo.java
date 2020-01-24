package myTextNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationdemo {
	public void setproperty()
	{
		System.out.println("set the driver path");
	}
	public void openchrome()
	{
		System.out.println("Open chrome");
	}
	
	@BeforeClass
	public void openapp()
	{
		System.out.println("Application");
	}
	
	@BeforeMethod
	public void gettitle()
	{
		System.out.println("display title");
	}
	
	@Test
	public void checktitle()
	{
		System.out.println("Check title");
	}
	
	@AfterMethod
	public void login()
	{
		System.out.println("Login of test");
	}
	
	@AfterClass
	public void logout()
	{
		System.out.println("Logout of test");
	}
	
	@AfterTest
	public void closebrowser()
	{
		System.out.println("close browser");
	}
	

}
