package day5_Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomDropdown {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
	    //setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			WebDriver driver=new ChromeDriver();
			//maximize brows windows
			driver.manage().window().maximize();
			//to enter requires application URL use get() of Webdriver interface
			driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//identify dropdownlist
			WebElement dropdown=driver.findElement(By.id("bsd1-button"));
			//create an instance of Select class and pass above element into its constructor
			dropdown.click();
		//identify all the options and store them into List<WebElement>
			List<WebElement>options=driver.findElements(By.cssSelector("div#bsd1-container>*:nth-child(2)>div>a"));
			
		//get default or already select option
			/**
			 * WebElement selectOption=selectSkill.getFirstSelectedOption();
			 * String selectedOptionName=selectedOption.getText();
			 * System.out.println("Already selected option name:"+selectOptionName);
			 */
			//OR
		
			//use size()to get option count
			System.out.println("option count:"+options.size());
			
		
			//Get dropdown option name
			for(int i=0;i<options.size();i++) {
				System.out.println("Option"+i+":"+options.get(i).getText());
			}
			options.get(2).click();

	}

}
