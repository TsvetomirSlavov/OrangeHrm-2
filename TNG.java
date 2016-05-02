package DEMO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNG
{
    @Test
	public void launchapp()
	{
		System.out.println("launch the browser");
		
	}
    @BeforeMethod
    public void beforemethod()
	{
		System.out.println("before method excuted");
		
		
	}
    @AfterMethod
    public void AFTER()
	{
		System.out.println("after method excuted");
		
	}
    
   @Test
     public void login()
	{
		System.out.println("user login ");
	}
   @Test
    public void logout()
	{
		System.out.println("logout the app");
		
	}
   @BeforeClass
   public void beforeclass()
	{
		System.out.println("before class");
		
	}
   @AfterClass
   public void afterclass()
  	{
  		System.out.println("after class");
  		
  	}
    
    
    
}