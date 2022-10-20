package day3_synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomation {

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
		driver.get("https://www.amazon.in");
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       String expectedTitle="";
       String actualTitle=driver.getTitle();
       System.out.println("page title is:"+actualTitle);
       driver.findElement(By.linkText("Sell")).click();
     
    String sellTitle= driver.getTitle();
    System.out.println("sellTitle is:"+sellTitle);
      // searchBox.submit();
       System.out.println(actualTitle.equals(sellTitle));
       driver.navigate().back();
       driver.close();
       

	}

}
