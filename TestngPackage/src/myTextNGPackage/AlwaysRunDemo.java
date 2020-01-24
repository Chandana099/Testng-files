package myTextNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunDemo {
	WebDriver driver;
	@Test
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		System.out.println("start application");
	}
	
	@Test(dependsOnMethods="startapp")
	public void checktitle() throws InterruptedException
	{
		driver.findElement(By.id("Email")).sendKeys("chandana.dec09@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("chandana1997");
		driver.findElement(By.xpath("//div[@class='inputs reversed']")).click();
		String expectedname="Demowebstore";
		String actualname=driver.getTitle();
		System.out.println(actualname);
		Assert.assertEquals(expectedname,actualname);
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("Log out of application");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods="checktitle",alwaysRun=true)
	public void logoff()
	{
		driver.close();
		
	}

}
