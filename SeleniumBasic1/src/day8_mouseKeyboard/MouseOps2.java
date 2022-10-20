package day8_mouseKeyboard;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOps2 {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
	    //setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			WebDriver driver=new ChromeDriver();
			//maximize brows windows
			driver.manage().window().maximize();
			//to enter requires application URL use get() of Webdriver interface
			driver.get("https://www.globalsqa.com/demo-site/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//identify all the elements of menu
	//List<WebElement>mainMenu=driver.findElements(By.cssSelector("div.dark_menu>div>ul>li>a"));
	List<WebElement>mainMenu=driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
	System.out.println("Main menu option count:"+mainMenu.size());
	for(int i=0;i<mainMenu.size();i++) {
		System.out.println(mainMenu.get(i).getText());
	}
	//create an instance of Action class by passing required browser instance to its constructor
	Actions act=new Actions(driver);
	//act.moveToElement(mainMenu.get(2)).perform();
	//act.moveToElement(mainMenu.get(1), 100, 0).perform();
	mouseHoverWthCords(act,mainMenu.get(1),100,0);
	for(int i=0;i<mainMenu.size();i++) {
		WebElement options=mainMenu.get(i);
		act.moveToElement(options).perform();
		Thread.sleep(1000);
	}
	//mousehoverOvertheElement(act,mainMenu.get(2));		

	}
      static void mousehoverOvertheElement(Actions act,WebElement element) {
    	   act.moveToElement(element).perform();
}
  static void mouseHoverWthCords(Actions act,WebElement options,int x,int y) {
	  System.out.println("option name is:"+options.getText());
	  act.moveToElement(options, x, y).perform();
  }
}