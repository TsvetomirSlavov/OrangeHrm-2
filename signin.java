package com.snapfish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class signin
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		Sleeper.sleepTightInSeconds(5);
		driver.get("http://snapfish.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("globalHeaderSignInRegister")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("EmailAddress")).sendKeys("kothakiran28@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("l@xmi021");
		driver.findElement(By.id("loginsubmit")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("globalHeaderUserMenu")).click();
		driver.findElement(By.className("omnituretrackthis")).click();
		}
        
	}


