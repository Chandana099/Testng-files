package listenerdemosuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiplebrowser {
	WebDriver driver;
	
	@BeforeTest
	
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("Webdriver.gecko.driver", "E:\\software required for testing batch\\Testing Softwares\\Selenium Updated Jar\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("Webdriver.chrome.driver", "E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			throw new Exception("Browser is correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void login() throws InterruptedException
	{
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterTest
	public void endtest()
	{
		driver.quit();
	}
}

