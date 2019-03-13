package com.task;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class automationpractice {
	
	
	public WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver","Utility1/chromedriver.exe");
			 driver = new ChromeDriver();
			
			//driver.manage().deleteAllCookies();
			driver.get("http://automationpractice.com/index.php");
	
			
		 
	       
	  }
	
  @Test
  public void SignIn() {
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click(); 
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhiventure@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("abhi1988");
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
  }
  
  @Test
  public void productPage() {
	  driver.findElement(By.xpath("//a[@title='Women']")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();
		
		 int size = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/iframe[1]")).size();
		  
		  driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/iframe[1]")));
		  System.out.println(size);
		  
		 
		  System.out.println(driver.findElement(By.id("quantity_wanted")).getText());
			 
			 driver.findElement(By.xpath("//p[@id='quantity_wanted_p']/a[2]/span/i")).click();
		  driver.findElement(By.id("add_to_cart")).click();
		  
		  String winHandleBefore = driver.getWindowHandle();
			
		  System.out.println("name of  currnet window "+winHandleBefore);

		  System.out.println("test test test");
		 

		  //driver.findElement(By.className("continue btn btn-default button exclusive-medium")).click();
		  
		  
		 
		  
		  WebElement element = driver.findElement(By.xpath("//div[4]/a/span"));
		  Actions actions = new Actions(driver);
		  actions.moveToElement(element).click().perform();
			
		  driver.findElement(By.xpath("//div[4]/a/span")).click();
		  
		  System.out.println("click on payment");
		  
		  
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,550)", ""); 
		  
		  
		  driver.findElement(By.linkText("Continue shopping")).click();
		  
		  
		  
		  
		  
		  
		  ////////////////////////////////////////////////////////////////
		  
		  /* Now Second order */
		  
		  
		  driver.findElement(By.xpath("//a[@title='Women']")).click();
		  
		  driver.findElement(By.xpath("//img[@title='Blouse']")).click();
		  
		  
		  
	      // 
		  
		//  driver.switchTo().frame("fancybox-iframe");
		  //now use the switch command
	      
		  int size1 = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/iframe[1]")).size();
		  
		  driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/iframe[1]")));
		  System.out.println(size1);
		  
		 System.out.println(driver.findElement(By.id("quantity_wanted")).getText());
		 
		 driver.findElement(By.xpath("//p[@id='quantity_wanted_p']/a[2]/span/i")).click();
		 
		  driver.findElement(By.id("add_to_cart")).click();
		  
		  
		  
		  String winHandleBefore1 = driver.getWindowHandle();
			
		  System.out.println("name of  currnet window "+winHandleBefore1);

		  System.out.println("test test test");
		 

		  //driver.findElement(By.className("continue btn btn-default button exclusive-medium")).click();
		  
		  
		 
		  
		  WebElement element1 = driver.findElement(By.xpath("//div[4]/a/span"));
		  Actions actions1 = new Actions(driver);
		  actions1.moveToElement(element1).click().perform();
			
		  driver.findElement(By.xpath("//div[4]/a/span")).click();
		  
		  System.out.println("click on payment");
		  
		  
		  JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		  jse1.executeScript("window.scrollBy(0,550)", ""); 
		  
		  
		  
		  
		  
		  
		  /*Now Proceed to payment2*/
		 
  }
  
  
  @Test
  
  public void payment() {
	  driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
		 
	  
	  
	  /*Now To address Proceed Checkout */
	  
	  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	  jse2.executeScript("window.scrollBy(0,550)", ""); 
	  
	  driver.findElement(By.xpath("//p/button/span")).click();
	  
	  
	  driver.findElement(By.xpath("//input[@id='cgv']")).click();
	  
	  
	  driver.findElement(By.xpath("//form[@id='form']/p/button/span")).click();
	  
	  
	  
	  JavascriptExecutor jse3 = (JavascriptExecutor)driver;
	  jse3.executeScript("window.scrollBy(0,550)", ""); 
	  
	  driver.findElement(By.className("cheque")).click();
	  
	  
	  driver.findElement(By.xpath("//p[@id='cart_navigation']/button/span")).click();
	  
	  
	  JavascriptExecutor jse4 = (JavascriptExecutor)driver;
	  jse4.executeScript("window.scrollBy(0,550)", ""); 
	  
	  driver.findElement(By.linkText("Back to orders")).click();
	  
	
		
		String winHandleBefore11 = driver.getWindowHandle();
		
		System.out.println("name of window "+winHandleBefore11);

	    // Switch to new window opened

	    for (String winHandle : driver.getWindowHandles()) {
	    	
	    	System.out.println(winHandle);
	        driver.switchTo().window(winHandle);
	    }

	    // Perform the actions on new window


	 
	              try
	    {
	       // driver.close();
	    }

	    catch(Exception e)
	    {
	        e.printStackTrace();
	        System.out.println("not close");
	                }

	              
	              driver.switchTo().window(winHandleBefore11);
	              System.out.println(driver.getCurrentUrl());
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
