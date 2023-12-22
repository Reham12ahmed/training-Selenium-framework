package tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Testbase {
	public static WebDriver driver;

	@BeforeSuite // because we use it on suit level
	@Parameters({"browser"})
	//@Optional("chrome")to set value if running isolated test case
	public void stratDriver(@Optional("chrome") String browsername) {
		//"equalignorecase" to ignore capital or small
		if(browsername.equalsIgnoreCase("chrome")) {
			//user.dir:to get the url for the project
			String chromepath=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromepath);
			 driver=new ChromeDriver();	
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			//user.dir:to get the url for the project
			String firefixpath=System.getProperty("user.dir")+"\\Drivers\\\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", firefixpath);
			 driver=new FirefoxDriver();	

			
		}
		
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		 driver.navigate().to("http://ipcportal2-sales.techlabs.london/");
	}
	@AfterSuite
	public void stopDriver() {
		driver.quit();

	}

}
