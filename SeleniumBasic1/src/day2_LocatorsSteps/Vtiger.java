package day2_LocatorsSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.get("");
         WebElement userNameInputField=driver.findElement(By.id("username"));
         userNameInputField.clear();
         userNameInputField.sendKeys("admin");
         WebElement password=driver.findElement(By.id("password"));
         password.clear();
         password.sendKeys("Test@123");
       //  driver.findElement(By.className("button")).click();
	}

}
