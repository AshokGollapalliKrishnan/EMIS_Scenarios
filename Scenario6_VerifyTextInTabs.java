package com.emishealthindia.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Scenario6_VerifyTextInTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.jqueryrain.com/?5JwC1hwx");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("tabs")).isDisplayed();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//a[@href='#tabs-2']/small")));
		WebElement tab2 = driver.findElement(By.xpath("//a[@href='#tabs-2']/small"));
		tab2.click();
		WebElement textVerify = driver.findElement(By.xpath("html/body/table/tbody/tr/td/div/div/div[2]"));
		String text = textVerify.getText();
		Assert.assertTrue(text.contains("pre loader rolling"));
		
		WebElement tab1 = driver.findElement(By.xpath("html/body/table/tbody/tr/td/div/ul/li[1]/a"));
		tab1.click();
		WebElement unOrderedList = driver.findElement(By.xpath("html/body/table/tbody/tr/td/div/ul/li[1]/a"));
		String list = unOrderedList.getText();
		Assert.assertTrue(text.contains("List 1"));

	}

}
