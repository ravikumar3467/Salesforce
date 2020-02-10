import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalpartiallink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\BrowersLaunch\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		String url="http://toolsqa.com/automation-practice-form/";
	
	driver.get(url);
	java.util.List<WebElement> links= driver.findElements(By.tagName("a"));

System.out.println(links.size());
			
	}

}
