package day3_synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectValidation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe");
		//creating an instance of Chrome browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//explicit wait(static wait)
		Thread.sleep(2000);
		//maximize browser window
		driver.manage().window().maximize();
		
		//to enter requires application URL use get()of WebDriver interface
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       //identify username input field
       WebElement userNameInputField=driver.findElement(By.name("username"));
       /**
        * Basic Validation on username input field
        * -visible or not
        * -editable or not
        * -default text
        */
      System.out.println("User name input field is visible or not?"+userNameInputField.isDisplayed());
      System.out.println("User name input field is editable or not?"+userNameInputField.isEnabled());
      String defaultValue=userNameInputField.getAttribute("placeholder");
      System.out.println("User name input field default value:"+defaultValue);
      //identify login button
      WebElement loginbtn=driver.findElement(By.className("orangehrm-login-button"));
      /**
       *  Basic Validation on login input field
        * -visible or not
        * -functional or not
        * -default text
       */
      System.out.println("Login button visible or not:"+loginbtn.isDisplayed());
      System.out.println("Login button is functional or not:"+loginbtn.isEnabled());
      String buttonName=loginbtn.getText();
      System.out.println("Button name is:"+buttonName);
	}

}
