package com.emishealthindia.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Scenario3_HoversTooltipText {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement hOverLink = driver.findElement(By.xpath("//div[@id='content']/ul/li/a[text()='Hovers']"));
		hOverLink.click();
		Actions action = new Actions(driver);
		WebElement userAvatar = driver.findElement(By.xpath("//img[@alt='User Avatar']"));
		action.moveToElement(userAvatar).build().perform();
		String userAvatarText = driver.findElement(By.tagName("h5")).getText();
	    Assert.assertEquals(userAvatarText, "name: user1");
	  }
}
