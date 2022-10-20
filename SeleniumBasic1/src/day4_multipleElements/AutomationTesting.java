package day4_multipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

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
			List<WebElement> menuNameList=driver.findElements(By.cssSelector("ul.nav.navbar-nav>li>a"));
          // List<WebElement> mobilePriceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));		
		for(int i=0;i<menuNameList.size();i++) {
			System.out.println(menuNameList.get(i).getText());
		}
		

	}

}
