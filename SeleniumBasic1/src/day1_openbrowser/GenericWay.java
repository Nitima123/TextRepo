package day1_openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWay {

	public static void main(String[] args) {
		// step:set path for driver executable
		System.setProperty("webdriver.chrome.driver","D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe");
		//step2:Create an instance of Required Browser class
         WebDriver driver  = new ChromeDriver();
	}

}
