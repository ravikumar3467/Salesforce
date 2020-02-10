import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class latestdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\BrowersLaunch\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		String url="https://www.spicejet.com/";
		
		driver.findElement(By.id("divpaxinfo"));
		
		

	}

}
