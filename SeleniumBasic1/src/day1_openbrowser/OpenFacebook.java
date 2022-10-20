package day1_openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com");
       String ActualUrl=driver.getCurrentUrl();
       String ActualTitle=driver.getTitle();
	}

}
