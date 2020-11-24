package testCase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1 {
	
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.findElementById("email").sendKeys("clarion@123");
	    driver.findElementById("pass").sendKeys("123456");
	   driver.findElementById("u_0_b").click();
	    driver.quit();
	}
	
	
	
	

}
