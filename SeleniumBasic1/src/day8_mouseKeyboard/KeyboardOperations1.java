package day8_mouseKeyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperations1 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
	    //setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			WebDriver driver=new ChromeDriver();
			//maximize brows windows
			driver.manage().window().maximize();
			//to enter requires application URL use get() of Webdriver interface
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//using escape of keyboard to avoid login pop-up
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);

	}

}
