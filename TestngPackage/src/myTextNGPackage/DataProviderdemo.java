package myTextNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataProviderdemo {
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String username, String password) {
	  driver.navigate().to("http://demowebshop.tricentis.com/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("Email")).sendKeys(username);
	  driver.findElement(By.name("Password")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	  driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"chandana.decO9@gmail.com", "chandana1997" },
      new Object[] { "rekhabr3@gmail.com", "rekhab" },
    };
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
