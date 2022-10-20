package day5_Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
	    //setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			WebDriver driver=new ChromeDriver();
			//maximize brows windows
			driver.manage().window().maximize();
			//to enter requires application URL use get() of Webdriver interface
			driver.get("https://www.redbus.in/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("src")).sendKeys("pune");
	List<WebElement>from=driver.findElements(By.cssSelector("div.fl.search-box.clearfix>div>ul>li"));
	from.get(1).click();
		
			
			
			
			
			driver.findElement(By.id("dest")).sendKeys("Goa");
			List<WebElement>destination=driver.findElements(By.cssSelector(".clearfix.search-wrap>div>div>ul>li>i"));
			destination.get(2).click();
			//.clearfix.search-wrap>div>div>ul>li>i
			//.homeSearch>li>i
			driver.findElement(By.className("next")).click();
			driver.findElement(By.cssSelector(".rb-calendar>table>tbody>*:nth-child(4)>*:first-child")).click();
			driver.findElement(By.id("search_btn")).click();
driver.findElement(By.cssSelector(".dept-time.dt-time-filter>li>*:nth-child(4)")).click();
driver.findElement(By.cssSelector(".details>*:nth-child(5)>*:nth-child(3)>*:nth-child(3)")).click();
List<WebElement>busName=driver.findElements(By.cssSelector("ul.bus-items>div>li>div>div>div>div>div"));
for(int i=0;i<busName.size();i++) {
	System.out.println(busName.get(i).getText());
}

	}

}
