package day3_synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWaitExample {

	public static void main(String[] args) throws InterruptedException {
		//String chromeExePath=System.getProperty(("user.dir")+"/SeleniumBasic1/executable/chromedriver.exe");
		//setting path for driver executables
		System.setProperty("webdriver.chrome.driver","D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe");
		//creating an instance of Chrome browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//explicit wait(static wait)
		Thread.sleep(2000);
		//maximize browser window
		driver.manage().window().maximize();
		//set size
		driver.manage().window().setSize(new Dimension(500,800));
		//to enter requires application URL use get()of WebDriver interface
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       //identify and click on login button
       driver.findElement(By.className("orangehrm-login-forgot")).click();
       //explicit wait(static wait)
       Thread.sleep(2000);
       //come back to previous page
       driver.navigate().back();
       //come back to next page
       driver.navigate().forward();
       //explicit wait
       Thread.sleep(2000);
       //to reload the current page
       driver.navigate().refresh();
       //explicit wait
       Thread.sleep(2000);
       //to move diff url
       driver.navigate().to("https://www.google.com");
	}

}
