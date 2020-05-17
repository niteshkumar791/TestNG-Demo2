package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class base2 {
	WebDriver driver = null;
	
	@Parameters({"Browser","url"})
	@BeforeMethod
	public WebDriver LaunchBrowser(String browser,String url) {				
		if (browser.equalsIgnoreCase("chrome")) {	
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "G:\\JAVA videos\\batch\\soft\\chromedriver.exe");
			driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.get(url);
		}		
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "G:\\JAVA videos\\batch\\soft\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		return driver;	
	}
	
	
	@AfterMethod
	public void CloseBrowser() {
		//driver.close();
	}
	

}
