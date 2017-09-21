package testCase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test3 {

	@Test
	public void test01(){
		System.setProperty("webdriver.chrome.browser", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://reviewprobe.in/");
		driver.findElementById("email").sendKeys("data1");
		driver.findElementById("password").sendKeys("data2");
		driver.quit();
		
		
		
	}
	
	
}
