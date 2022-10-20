package day4_multipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
	    //setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			WebDriver driver=new ChromeDriver();
			//maximize brows windows#tbodyid>div>div>div>h4>a
			driver.manage().window().maximize();
			//to enter requires application URL use get() of Webdriver interface
			driver.get("https://www.demoblaze.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			List<WebElement> mobileNameList=driver.findElements(By.cssSelector("#tbodyid>div>div>*:nth-child(2)>h4>a"));
           List<WebElement> mobilePriceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));		
		for(int i=0;i<mobileNameList.size();i++) {
			System.out.println(mobileNameList.get(i).getText()+"----->"+mobilePriceList.get(i).getText());
		}
		//
		
		
		
		
		
	}

}
