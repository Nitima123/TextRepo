package day3_synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe");
		//creating an instance of Chrome browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//explicit wait(static wait)
		Thread.sleep(2000);
		//maximize browser window
		driver.manage().window().maximize();
		//set size
		//driver.manage().window().setSize(new Dimension(500,800));
		//to enter requires application URL use get()of WebDriver interface
		driver.get("https://demosite.executeautomation.com/Login.html");
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       //step 3:enter username as admin
       driver.findElement(By.name("UserName")).sendKeys("execution");
       //step 4:enter password as manager
       driver.findElement(By.name("Password")).sendKeys("admin");
       String actualTitle=driver.getTitle();
       System.out.println("title is:"+actualTitle);
       //step5:click on login button
       driver.findElement(By.cssSelector("input[name='Login']")).click();

	}

}
