package com.emishealthindia.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario1_BodyContentEmpty {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frameLink = driver.findElement(By.xpath("//div[@id='content']/ul/li/a[text()='Frames']"));
		frameLink.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement iFrameLink= driver.findElement(By.xpath("//div[@id='content']/div/ul/li/a[text()='iFrame']"));
		iFrameLink.click();
		WebElement bodyOfContent = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(bodyOfContent);
		WebElement textBox = driver.findElement(By.id("tinymce"));
		textBox.clear();
		driver.switchTo().defaultContent();
		WebElement bold = driver.findElement(By.xpath(".//*[@id='mceu_3']/button"));
		bold.click();
		driver.switchTo().frame(bodyOfContent);
		textBox.sendKeys("Lorem ipsum dolor sit amet");
		driver.switchTo().defaultContent();
		WebElement fileButton = driver.findElement(By.id("mceu_15-open"));
		fileButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement newDoc = driver.findElement(By.id("mceu_33-text"));
		newDoc.click();
		System.out.println("Content has been replaced and performed NewDocument");

	}
}
