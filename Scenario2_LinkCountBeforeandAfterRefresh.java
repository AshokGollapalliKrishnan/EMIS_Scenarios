package com.emishealthindia.scenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Scenario2_LinkCountBeforeandAfterRefresh {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement disAppEleLink = driver.findElement(By.xpath("//div[@id='content']/ul/li/a[text()='Disappearing Elements']"));
		disAppEleLink.click();
		List<WebElement> allLinkCount = driver.findElements(By.tagName("li"));
		int linkCount = allLinkCount.size();
		System.out.println("Total Number of link count on webpage = " + linkCount);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// After Refreshment
		List<WebElement> allLinkCountAfterRefresh = driver.findElements(By.tagName("li"));
		int linkCountAfterRefresh = allLinkCountAfterRefresh.size();
		System.out.println("======= AFTER REFRESHMENT ==================");
		System.out.println("Total Number of link count on webpage after Refreshment = " + linkCountAfterRefresh);
		Assert.assertEquals(linkCountAfterRefresh, linkCount+1);
	}
}
