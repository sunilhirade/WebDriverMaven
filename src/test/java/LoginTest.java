import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest
{
	public static WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Library\\geckodriver-v0.16.1-win32\\geckodriver.exe");
		
		 driver = new FirefoxDriver();
	}
		
		
		@Test
		public void doLogin(){
		
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("hirade.sunil@gmail.com");
			driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("87935642");
		
			
			
		
		
	}
	public void teardown () {
		
		driver.close();
		
		
	}

}
