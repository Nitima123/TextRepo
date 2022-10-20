package day2_LocatorsSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecuteAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\geckodriver.exe");
		FirefoxDriver fdriver=new FirefoxDriver();
	       fdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       //step2:enter app URL
	       fdriver.get("https://demosite.executeautomation.com/Login.html");

	}

}
