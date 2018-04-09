package Login;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class login_success {
	@Test
	public void testSample1() throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\WorkingFolder\\Setups\\Selenium\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "http://legalmetrology-qa.rainconcert.biz/login";
		
		
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    	  driver.findElement(By.id("webmaster")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("boban.gm@rainconcert.in");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Rain12345");
    driver.findElement(By.cssSelector("button.btn")).click(); 
    Assert.assertEquals(driver.getTitle(),"Safe Fleet - WebMaster Dashboard");
    driver.close();
  }
}
