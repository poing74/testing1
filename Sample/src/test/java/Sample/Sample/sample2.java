package Sample.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class sample2 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}*/
	@Test
	public void launchbrowser(){
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//Sriharsha//workspace//Sample//Drivers//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("http://www.Apple.com");
	driver.quit();
	
	 
	

}
}
