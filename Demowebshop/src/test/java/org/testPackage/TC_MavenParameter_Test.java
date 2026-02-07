package org.testPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_MavenParameter_Test {
	
    @Test
    
    public void mavenParameter()
    {
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	String url = System.getProperty("url"); 
    	driver.get(url);
    	
    	String data = System.getProperty("data");
    	driver.findElement(By.name("q")).sendKeys(data,Keys.ENTER);
    }
}
