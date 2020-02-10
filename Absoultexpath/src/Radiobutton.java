import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowersLaunch\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://toolsqa.com/automation-practice-form/";
		driver.get(url);
		
	
		 // Store all the elements of same category in the list of WebLements 
		 
	
		 
		 List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
		
	  boolean bValue = false;
		 bValue=rdBtn_Sex.get(0).isSelected();
		 
		
	
		 if (bValue=true)
				 
				 {
			 rdBtn_Sex.get(1).click();
				 }
		 
		 else
			 
		 {
		 
			 bValue = true; bValue=rdBtn_Sex.get(1).isSelected();		
			 
			 
			 rdBtn_Sex.get(0).click(); 
		 }
		 
		 
		 
	}
}

		 
		