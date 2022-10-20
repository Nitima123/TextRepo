package day3_synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe" );
	       WebDriver driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       //step2:enter app URL
	       driver.get("https://demo.actitime.com");
	       WebElement userNameInputField=driver.findElement(By.id("username"));
	       userNameInputField.sendKeys("admin");
	       WebElement password=driver.findElement(By.name("pwd"));
	       password.sendKeys("manager");
	       driver.findElement(By.id("loginButton")).click();
	       //fluent wait declaration
	       Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
	    		   .withTimeout(Duration.ofSeconds(30))
	    		   .pollingEvery(Duration.ofSeconds(5))
	    		   .ignoring(NoSuchElementException.class);
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	       System.out.println("homepage title:"+driver.getTitle());

	}

}
