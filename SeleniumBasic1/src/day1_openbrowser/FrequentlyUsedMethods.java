package day1_openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrequentlyUsedMethods {

	public static void main(String[] args) {
		// Step1:Set path for driver 
		System.setProperty("webdriver.chrome.driver","D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe");
      //step2:Create an instance of Required Browser class
		WebDriver driver=new ChromeDriver();
		//enter the application URL
		driver.get("https://demo.actitime.com/login.do");
		
		//verify URL and title
		String actualUrl=driver.getCurrentUrl();
		String actualTitle =driver.getTitle();
		System.out.println("Actual uRl is:"+actualUrl);
		System.out.println("actual Title is:"+actualTitle);
		String expectedUrl="https://demo.actitime.com/login.do";
		String expectedTitle="actiTIME - Login";
		System.out.println("URL validation:"+actualUrl.equals(expectedUrl));
		System.out.println("Title validation:"+actualTitle.equals(expectedTitle));
		String pageSource=driver.getPageSource();
		System.out.println("page Source Length:"+pageSource.length());
		System.out.println("page Source content:"+pageSource);
		//close current browser
		//driver.close();
	}

}
/**
 * open chrome browser
 * enter application URL as https://demo.actitime.com
 * verify following component in the login page
 * -title
 * -url
 * close the browser
 */
