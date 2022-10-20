package day5_Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
	    //setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			WebDriver driver=new ChromeDriver();
			//maximize brows windows
			driver.manage().window().maximize();
			//to enter requires application URL use get() of Webdriver interface
			driver.get("https://www.makemytrip.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//identify departure date and click on it
			driver.findElement(By.cssSelector("label[for='departure']")).click();
			//select any date from next month
driver.findElement(By.cssSelector("div.DayPicker-Months>*:nth-child(2)>*:nth-child(3)>*:nth-of-type(2)>*:nth-child(2)>div>p")).click();
	}

}
