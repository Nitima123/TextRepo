package day1_openbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		//step1:using System.setProperty(key,value)set to path for geckodriver
		System.setProperty("webdriver.gecko.driver", "D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\geckodriver.exe");
      //step2:create an instance of FirefoxDriver class
		FirefoxDriver fdriver=new FirefoxDriver();
	}

}
