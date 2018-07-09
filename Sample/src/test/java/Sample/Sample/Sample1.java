package Sample.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Sample1 {
	

	/*public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.launchBrowser();
		// TODO Auto-generated method stub

	}*/
	@Test
public void launchBrowser () {
	// launch chrome 
	System.setProperty("webdriver.chrome.driver", "C://Users//Sriharsha//workspace//Sample//Drivers//chromedriver.exe"); 		
	WebDriver driver = new ChromeDriver();
	// launch firefor
	/*System.setProperty("webdriver.gecko.driver", "C://Users//Sriharsha//Desktop//geckodriver.exe"); 		
	driver = new FirefoxDriver();
	System.setProperty("webdriver.ie.driver", "C://Users//Sriharsha//Desktop//IEDriverServer.exe"); 		
	WebDriver driver = new InternetExplorerDriver();*/
	driver.manage().window().maximize();
	driver.get("http://amazon.com");
	driver.quit();
	
}
}
