package day1_openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenJavaTPoint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		String ActualUrl=driver.getCurrentUrl();
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Tutorials List - Javatpoint";
		String ExpectedUrl="https://www.javatpoint.com/";
		System.out.println("URL Validation:"+ActualUrl.equals(ExpectedUrl));
		System.out.println("Title Validation:"+ActualTitle.equals(ExpectedTitle));
		 String pageSource    =driver.getPageSource();
	       System.out.println("The pageSource length:"+pageSource.length());
	}

}
