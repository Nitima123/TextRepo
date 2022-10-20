package day1_openbrowser;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEBrowser {

	public static void main(String[] args) {
		// Step1:set path for IE driver
		System.setProperty("webdriver.ie.driver","D:\\RAMA MESHRAM\\WORKSPACE\\SeleniumBasic1\\executable\\IEDriverServer.exe");
        //step2:create an instance of IE
		InternetExplorerDriver idriver=new InternetExplorerDriver();
	}

}
