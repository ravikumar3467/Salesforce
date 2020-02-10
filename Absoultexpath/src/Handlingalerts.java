import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalerts {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\BrowersLaunch\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		String url =("https://demo.guru99.com/");
			
				driver.get(url);
				Thread.sleep(2000);
				
				
				
				driver.findElement(By.id("details-button")).click();
				Thread.sleep(2000);
								
				driver.findElement(By.id("proceed-link")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.name("emailid")).sendKeys("23523425");
		
		driver.findElement(By.name("btnLogin")).click();
		
		Alert al= driver.switchTo().alert();
		al.accept();
		
		
		// TODO Auto-generated method stub

	}

}
