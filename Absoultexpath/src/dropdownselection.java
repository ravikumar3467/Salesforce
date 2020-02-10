import org.omg.PortableServer.POAManagerPackage.State;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowersLaunch\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		String url="http://primusbank.qedgetech.com/";
		driver.get(url);
		
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");	
		driver.findElement(By.name("login")).click();		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Select  country  =  new Select ( driver.findElement(By.id("lst_countryS")));
		country.selectByValue ("INDIA");
		Select  State  =  new Select ( driver.findElement(By.id("lst_stateS")));
		State.selectByIndex(2);
		
		
				
	
				
				//Select  Numberofpassengers = new Select (driver.findElement(By.id("divpaxinfo")));
	
		
		


	}
}
