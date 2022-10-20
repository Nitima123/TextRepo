package day4_multipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsamerana {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
	    //setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			WebDriver driver=new ChromeDriver();
			//maximize brows windows
			driver.manage().window().maximize();
			//to enter requires application URL use get() of Webdriver interface
			driver.get("https://www.gsmarena.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			List<WebElement> mobileList=driver.findElements(By.cssSelector("div#body>aside>*:first-child>ul>li>a"));
        System.out.println("MobileList is:"+mobileList.size());
        driver.findElement(By.id("")).sendKeys("SAMSUNG");
        WebElement firstMobile=mobileList.get(0);
        System.out.println("FirstMobileName:"+firstMobile.getText());
        for(int i=0;i<mobileList.size();i++) {
        	System.out.println(mobileList.get(i).getText());
        }
	}

}
