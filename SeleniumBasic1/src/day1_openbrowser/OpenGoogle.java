package day1_openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\chromedriver.exe");
         ChromeDriver driver=new ChromeDriver();
          driver.get("https://www.google.com");
         // String ActualUrl=driver.getCurrentUrl();
         // System.out.println("ActualUrl:"+ActualUrl);
        //  String ActualTitle=driver.getTitle();
        //  System.out.println("ActualTitle is:"+ActualTitle);
      //  String expectedUrl="https://www.google.com/";
      //  String expectedTitle="Google";
     //   System.out.println("URL Validation:"+ActualUrl.equals(expectedUrl));
     //   System.out.println("Title Validation:"+ActualTitle.equals(expectedTitle));
  // String pageSource    =driver.getPageSource();
   //    System.out.println("The pageSource length:"+pageSource.length());
	}

}
