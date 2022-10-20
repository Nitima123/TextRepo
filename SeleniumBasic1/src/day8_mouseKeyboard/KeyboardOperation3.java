package day8_mouseKeyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperation3 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
	    //setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			WebDriver driver=new ChromeDriver();
			//maximize brows windows
			driver.manage().window().maximize();
			//to enter requires application URL use get() of Webdriver interface
			driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement FirstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
			//type a first name as a admin and use ctrl a
			FirstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
			//in a first field use control c
			FirstName.sendKeys(Keys.chord(Keys.CONTROL,"C"));
			driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
			

	}

}
