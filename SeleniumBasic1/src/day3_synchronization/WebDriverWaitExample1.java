package day3_synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExample1 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
	    //setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			WebDriver driver=new ChromeDriver();
			//maximize brows windows
			 driver.get("https://demo.actitime.com/");
			driver.manage().window().maximize();
			//to enter requires application URL use get() of Webdriver interface
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//explicit wait(dynamic)
			 WebDriverWait wait=new WebDriverWait(driver,20);		
	      
	       
	     //step2:enter app URL
	      
	       WebElement userNameInputField=driver.findElement(By.id("username"));
	       userNameInputField.sendKeys("admin");
	       WebElement password=driver.findElement(By.name("pwd"));
	       password.sendKeys("manager");
	       driver.findElement(By.id("loginButton")).click();
	       //validation will be failed, to avoid this we will use explicit wait(conditional wait)
	      
	       wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
	       //step6:validate home page
	       
	       String actualTitle=driver.getTitle();
	       
	       System.out.println("ActualTitle is:"+actualTitle);
	       
	   //add condition to wait using webDriverWait instance
	       wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));  
	    //click on logout link
	       WebElement logoutLink=driver.findElement(By.id("logoutLink"));
	       logoutLink.click();
	       //close the broswer
	       driver.close();
	    	   
	       
	       
	  

	}

}
