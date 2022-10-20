package day2_LocatorsSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       WebElement UserNameInputField=driver.findElement(By.xpath("//input[@name='username']"));
        UserNameInputField.sendKeys("Admin");
        WebElement password=driver.findElement(By.name("password"));
       // driver.findElement(By.xpath("//input[@name='password']"));
       password.sendKeys("admin123");
       driver.findElement(By.className("orangehrm-login-button")).click();
      // driver.findElement(By.xpath(//button[@type='submit'])).
       String expectedTitle="Orange-Hrm";
      String actualTitle= driver.getTitle();
      System.out.println("ActualTitle is:"+actualTitle);
	}

}
