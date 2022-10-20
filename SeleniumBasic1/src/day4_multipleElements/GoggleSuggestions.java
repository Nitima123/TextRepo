package day4_multipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoggleSuggestions {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
    //setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		//maximize brows windows
		driver.manage().window().maximize();
		//to enter requires application URL use get() of Webdriver interface
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Selenium");
	List<WebElement>suggList=	driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>span"));
	//get suggestion count
	System.out.println("suggestion count is:"+suggList.size());
	//to get element from the list
	      WebElement fistSuggestion=suggList.get(0);
	      System.out.println("first suggestion name is:"+fistSuggestion.getText());
	      for(int i=0;i<suggList.size();i++) {
	    	  System.out.println(suggList.get(i).getText());
	      }
	}
}
