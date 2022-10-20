package day2_LocatorsSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe" );
	       WebDriver driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       //step2:enter app URL
	       driver.get("https://www.saucedemo.com/");
	       WebElement userNameInputField=driver.findElement(By.id("user-name"));
	       userNameInputField.sendKeys("standard_user");
	       WebElement password=driver.findElement(By.id("password"));
	       password.sendKeys("secret_sauce");
	       driver.findElement(By.id("login-button")).click();
	       //validate home page
	       String expectedTitle="Swag Labs";
	       String actualTitle=driver.getTitle();
	       System.out.println("expectedTitle:"+expectedTitle);
	       System.out.println("actualTitle:"+actualTitle);
	       if(actualTitle.equals(expectedTitle)) {
	    	   System.out.println("Login validation is passed");
	       }else {
	    	   System.out.println("Login validation is failed");
	       }
       driver.findElement(By.id("logout_sidebar_link")).click();
	}

}
