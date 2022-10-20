package day4_multipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

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
		List<WebElement> menuList=	driver.findElements(By.xpath("//div[@class='xtXmba']"));
		for(int i=0;i<menuList.size();i++)	{
			System.out.println(menuList.get(i).getText());
			
		}

	}

}
