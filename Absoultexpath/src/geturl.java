import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class geturl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\BrowersLaunch\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String url="http://www.shop.demoqa.com";
	
	driver.get( url);
	String title=driver.getTitle();
	int lenght= driver.getTitle().length();
	
	System.out.println("Titile of the page" + title  );
	System.out.println("Titlelenght" + lenght);

	String actualurl=driver.getCurrentUrl();

if (actualurl.equals(url))
{
	System.out.println("Verfication sucessful: The correct Url is opened");

}
else 
	{
	System.out.println("Verfication Failed : The correct Url is not  opened");
	System.out.println("The actual URL"+ actualurl);
	System.out.println("The expected url"+ url);
	
	 String pageSource = driver.getPageSource();
	 int  pagesourseLenght= driver.getPageSource().length();
	 
	System.out.println("The lenght of the page sourse" + pagesourseLenght ); 
	driver.close();
	
}



}
	}

