package day8_mouseKeyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOps1 {

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
			WebElement username=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
			username.sendKeys("admin");
			//create an instance of actions class by passing required browser instance to
			//its instance
			Actions act=new Actions(driver);
//with the help of actions class reference perform appropriate actions
			act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	//Paste it in last namr field
	WebElement lastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	act.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

}
