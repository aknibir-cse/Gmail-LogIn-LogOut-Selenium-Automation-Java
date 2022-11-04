package com.selenium.automation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GmailSignInSignOut {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknib\\eclipse-workspace\\GmailAutoSignInSignOut\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com");
		
				driver.findElement(By.id("identifierId")).sendKeys("aknibir.cse@gmail.com");
				driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
				driver.findElement(By.name("password")).sendKeys("oprcdxtbhfnjrewk");
				driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
				
				// click on the profile icon
				driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a")).click();
				
				// click on the sign out
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				WebElement Test = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sign out')]")));
				Test.click();
				driver.quit();
		
	}

}
