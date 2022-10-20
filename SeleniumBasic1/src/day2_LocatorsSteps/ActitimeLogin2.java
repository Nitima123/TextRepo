package day2_LocatorsSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLogin2 {

	public static void main(String[] args) {
		// Step1:Open chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe" );
       WebDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     //step2:enter app URL
       driver.get("https://demo.actitime.com/");
       WebElement userNameInputField=driver.findElement(By.id("username"));
       userNameInputField.sendKeys("admin");
       WebElement password=driver.findElement(By.name("pwd"));
       password.sendKeys("manager");
       driver.findElement(By.id("loginButton")).click();
       //validation will be failed, to avoid this we will use explicit wait(conditional wait)
       WebDriverWait wait=new WebDriverWait(driver,20);
       wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
       //step6:validate home page
       String expectedTitle="actiTIME-Enter Time-Track";
       String actualTitle=driver.getTitle();
       System.out.println("Expected Title is:"+expectedTitle);
       System.out.println("ActualTitle is:"+actualTitle);
       if(actualTitle.equals(expectedTitle)) {
    	   System.out.println("Login validation is passed");
       }else {
    	   System.out.println("Login validation is failed");
       }
       //Identify logout link and click on it
       driver.findElement(By.id("logoutLink")).click();
       
	}

}
