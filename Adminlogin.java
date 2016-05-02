package HRMS;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterClass;

public class Adminlogin
{
	WebDriver driver;
	
  @BeforeClass
  public void launchapp()
  {
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=new FirefoxProfile();
	fp=pr.getProfile("Selenium");
	WebDriver driver=new FirefoxDriver(fp);
	driver.get("http://opensource.demo.orangehrm.com");
	

  }
  @BeforeMethod
  public void login() 
  {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
  }

  @AfterMethod
  public void logout() 
  {
	  driver.findElement(By.linkText("Welcome Admin")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  
	 }
 @AfterClass
  public void closeapp()
  {
	 driver.quit();
	
  }

}
