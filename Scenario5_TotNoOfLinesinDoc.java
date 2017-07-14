package com.emishealthindia.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario5_TotNoOfLinesinDoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement frameLink = driver.findElement(By.xpath("//div[@id='content']/ul/li/a[text()='Frames']"));
		frameLink.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement iFrameLink= driver.findElement(By.xpath("//div[@id='content']/div/ul/li/a[text()='iFrame']"));
		iFrameLink.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement fileButton = driver.findElement(By.id("mceu_15-open"));
		fileButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement newDoc = driver.findElement(By.id("mceu_33-text"));
		newDoc.click();
		WebElement bodyOfContent = driver.findElement(By.id("tinymce"));
		//WebElement typeText = driver.findElement(By.xpath("html/body/p"));
		bodyOfContent.submit();
		bodyOfContent.sendKeys("Ashok");
		
		
	
	}

}
