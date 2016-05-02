package HRMS;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Empres extends Adminlogin
{
  @Test
  public void reg()
  {
	  driver.findElement(By.linkText("PIM")).click();
	  driver.findElement(By.linkText("Add Employee")).click();
	  driver.findElement(By.id("firstName")).sendKeys("raju");
	  driver.findElement(By.id("lastName")).sendKeys("kotha");
	  driver.findElement(By.id("employeeId")).clear();
	driver.findElement(By.id("employeeId")).sendKeys("00143");
	driver.findElement(By.id("btnSave")).click();
  }
}
