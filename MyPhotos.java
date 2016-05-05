
	package com.snapfish;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.server.browserlaunchers.Sleeper;
	import org.testng.annotations.Test;

	public class MyPhotos 
	{
		static WebDriver driver;
		@Test(priority=0)
		public void laaunch()
		{
		
		driver=new FirefoxDriver();
		Sleeper.sleepTightInSeconds(10);
		driver.get("http://snapfish.com");
		driver.manage().window().maximize();
		}
		@Test(priority=1)	
		public void login()
		{
		driver.findElement(By.id("globalHeaderSignInRegister")).click();
		driver.findElement(By.id("EmailAddress")).sendKeys("kothakiran28@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("l@xmi021");
		driver.findElement(By.id("loginsubmit")).click();
		}

	@Test(priority=2)
	public void myphotos()
	{
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("MYPHOTOS")).click();
		driver.findElement(By.id("addPhotosSection")).click();
		
	}
}