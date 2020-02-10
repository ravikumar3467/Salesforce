import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowersLaunch\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://toolsqa.com/automation-practice-form/";
		driver.get(url);
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("link"));

		
		driver.getCurrentUrl();
		driver.getTitle();
		System.out.println("partial link Test pass");
		

		 String sClass = driver.findElements(By.tagName("button")).toString();	
		 System.out.println(sClass);
		
		

	}

}
