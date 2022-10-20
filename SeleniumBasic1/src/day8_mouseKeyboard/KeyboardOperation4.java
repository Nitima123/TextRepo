package day8_mouseKeyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperation4 {

	public static void main(String[] args) throws InterruptedException {
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
WebElement element=driver.findElement(By.xpath("//body"));
element.sendKeys(Keys.ESCAPE);
			//scrolling using a pagedown button
			for(int i=0;i<10;i++) {
				element.sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(1500);
			}
			Thread.sleep(1500);
			//scrolling-->go to bottom of the page
			element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
			Thread.sleep(1500);
			//scrolling directly go to the top of the page
			element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));


	}

}
