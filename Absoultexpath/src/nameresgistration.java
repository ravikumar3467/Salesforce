import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameresgistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowersLaunch\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String currentwindowname = driver.getWindowHandle();
		System.out.println("The name of the window"+  currentwindowname);
		
		String url="http://toolsqa.com/automation-practice-form/";
		driver.get(url);
		driver.findElement(By.name("firstname")).sendKeys("Ravi");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("kumar2");
		driver.findElement(By.xpath("//*[@id=\"buttonwithclass\"]")).click();
	driver.close();
	}
	
	

}
