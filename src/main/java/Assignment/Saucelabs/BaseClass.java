package Assignment.Saucelabs;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Assignment.pom.ProductsPage;
import Assignment.pom.LoginPage;

public class BaseClass {
	public static ChromeOptions options;
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		options = new ChromeOptions();
		options.addArguments("--incognito");
		 driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		File f = new File();//Object creation
		String url= f.ExcelData("SauceData", 1, 0);//fetching the URL from excel sheet
		String un=f.ExcelData("SauceData", 4, 0);//fetching username from the excel sheet
		String pw = f.ExcelData("SauceData", 4, 1);//fetching password from the excel sheet
		
		driver.get(url);//to open the website
		LoginPage lg=new LoginPage(driver);//object creation for loginpage
		lg.setLogin(un, pw);//to login 
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		
		
		ProductsPage hp=new ProductsPage(driver);
		hp.setLogout();
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		//Thread.sleep(2000);
		driver.quit();
	}





	}
	
	
	
