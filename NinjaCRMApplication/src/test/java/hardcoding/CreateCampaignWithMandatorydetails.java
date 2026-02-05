package hardcoding;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCampaignWithMandatorydetails {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions settings=new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.password_manager_leak_detection",false );
		settings.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://49.249.28.218:8098/");
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.xpath("//span[text()='Create Campaign']")).click();
		driver.findElement(By.name("Campaign Name")).sendKeys("Leena");
		WebElement size = driver.findElement(By.name("Target Size"));
		size.clear();
		size.sendKeys("4");
		driver.findElement(By.xpath("//button[text()='Create Campaign']")).click();
		WebElement toastmsg = driver.findElement(By.xpath("//div[@role='alert']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
		wait.until(ExpectedConditions.visibilityOf(toastmsg));
		String msg = toastmsg.getText();
		if (msg.contains("Leena")) {
			System.out.println("Campaign Created");	
		} else {
			System.out.println("Campaign not Created");
		}
		WebElement icon = driver.findElement(By.xpath("//div[@Class='user-icon']"));
		Actions act = new Actions(driver);
		act.moveToElement(icon).click().perform();
		driver.findElement(By.xpath("//div[text()='Logout']")).click();
		driver.quit();
	}

	

}
