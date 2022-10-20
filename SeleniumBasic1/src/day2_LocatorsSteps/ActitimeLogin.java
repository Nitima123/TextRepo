package day2_LocatorsSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       //implicit wait
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
       		
       
       WebElement password=driver.findElement(By.name("pwd"));
       password.sendKeys("manager");
       driver.findElement(By.id("loginButton")).click();
       //step6:validate home page
       String expectedTitle="actiTime -Enter Time-Track";
       String actualTitle=driver.getTitle();
       System.out.println("Expected Title:"+expectedTitle);
       System.out.println("Actual Title:"+actualTitle);
       //validation will be failed
       if(actualTitle.equals(expectedTitle)) {
    	   System.out.println("Login validation is passed");
       }else {
    	   System.out.println("Login validation is failed");
       }
       //identify logout link and click on it
       driver.close();
       
       
       
       
	}

}
