import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\BrowersLaunch\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

String url= "http://DemoQA.com";
driver.get(url);
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/aside[2]/ul/li[1]/a")).click();
driver.navigate().back();
driver.navigate().forward();
driver.navigate().to(url);
driver.navigate().refresh();
driver.close();

	}
}
