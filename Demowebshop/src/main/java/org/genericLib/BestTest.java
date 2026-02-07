package org.genericLib;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.pomRepository.BasePage;
import org.pomRepository.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BestTest implements FrameWorkConstants 
{
	public static WebDriver driver;
	@BeforeClass
	public void browserSetup()
	{
		 String browserValue = Flib.getPropertyValue(PROPERTIES_PATH_MAIN);
		 String url = Flib.getPropertyValue(PROPERTIES_PATH_MAIN);
		 
		 RemoteWebDriver driver;
		 if (browserValue.equalsIgnoreCase("chrome")) {
			  driver = new ChromeDriver();
			
		} 
		 else if(browserValue.equalsIgnoreCase("firefox")){
			 driver= new FirefoxDriver();

		}
		 else {
			driver=new EdgeDriver();
			
		}
	//	 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get(url);
		 
	}
	@BeforeMethod
	public void login()
	{
		String email = Flib.getPropertyValue("email");
		String password = Flib.getPropertyValue("password");
		//here on line number 52 we are just following the process of login given below of line number 62
		BasePage bp = new BasePage(driver);
		bp.getLoginLink().click();
		
		//here on line number 57,58,59 we are just following the process of login given below of line number 63,64,65
		LoginPage lp = new LoginPage(driver);
		lp.getLoginEmailTB().sendKeys(email);
		lp.getLoginPasswordTB().sendKeys(password);
		lp.getLoginButton().click();
		
		
		
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys(email);
//		driver.findElement(By.id("Password")).sendKeys(password);
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	
	@AfterMethod
	public void logout()
	{
		BasePage bp= new BasePage(driver);
		bp.getLogoutLink().click();
		//driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void browserTearDown()
	{
		driver.quit();
	}
	
	

}
