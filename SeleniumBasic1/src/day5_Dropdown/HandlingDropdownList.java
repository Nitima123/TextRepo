package day5_Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
	    //setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			WebDriver driver=new ChromeDriver();
			//maximize brows windows
			driver.manage().window().maximize();
			//to enter requires application URL use get() of Webdriver interface
			driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//identify dropdownlist
			WebElement skillDropdown=driver.findElement(By.id("Skills"));
			//create an instance of Select class and pass above element into its constructor
			Select selectSkill=new Select(skillDropdown);
		//check wheather dropdown is multiselect dropdown or not
			System.out.println("Is dropdown is allowing you to select multiple option:"+selectSkill.isMultiple());
		//get default or already select option
			/**
			 * WebElement selectOption=selectSkill.getFirstSelectedOption();
			 * String selectedOptionName=selectedOption.getText();
			 * System.out.println("Already selected option name:"+selectOptionName);
			 */
			//OR
			System.out.println("Already selected option name:"+selectSkill.getFirstSelectedOption().getText());
			//get option count
			List<WebElement>options=selectSkill.getOptions();
			System.out.println("Option count is:"+options.size());
			//Get dropdown option name
			for(int i=0;i<options.size();i++) {
				System.out.println("Option"+i+":"+options.get(i).getText());
			}
			//select options from dropdown
			selectSkill.selectByIndex(4);
			System.out.println("Already selected option name:"+selectSkill.getFirstSelectedOption().getText());
       //or
			selectSkill.selectByValue("Backup Management");
			System.out.println("Already selected option name:"+selectSkill.getFirstSelectedOption().getText());
			//or
			selectSkill.selectByVisibleText("Analytics");
			System.out.println("Already selected option name:"+selectSkill.getFirstSelectedOption().getText());
	//checking order of skill
			String skillName="";
			//get dropdown names
			for(int i=1;i<options.size();i++) {
		
			
			if(options.size()-1!=i) {
				skillName=skillName+options.get(i).getText()+" ,";
			}else {
				skillName=skillName+options.get(i).getText();
			}
					
	}
			//Expected Skills
			String exp_skillName="Adobe InDesign,Adobe Photoshop,Analytics,Android,APIs,Art Design,AutoCad,Backup";
			System.out.println("skillName:"+skillName);
			System.out.println("exp_skillName:"+exp_skillName);
			System.out.println("Skills are in sorted order or not:"+skillName.equals(exp_skillName));

	}
}
