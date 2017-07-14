package com.emishealthindia.scenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario7_CreateandEditEmp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://cafetownsend-angular-rails.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Login to the Application with valid credentials
		WebElement userName = driver.findElement(By.xpath(".//*[@id='login-form']/fieldset/label[1]/input"));
		userName.sendKeys("Luke");
		WebElement passWord = driver.findElement(By.xpath(".//*[@id='login-form']/fieldset/label[2]/input"));
		passWord.sendKeys("Skywalker");
		WebElement loginButton = driver.findElement(By.xpath(".//*[@id='login-form']/fieldset/button"));
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("APPLICATION LOGGED SUCCESSFULLLY");
		
		// CREATE AN EMPLOYEE PROFILE
		WebElement createButton = driver.findElement(By.id("bAdd"));
		createButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement firstName = driver.findElement(By.xpath("html/body/div[1]/div/div/form/fieldset/label[1]/input"));
		firstName.sendKeys("a");
		WebElement lastName = driver.findElement(By.xpath("html/body/div[1]/div/div/form/fieldset/label[2]/input"));
		lastName.sendKeys("b");
		WebElement startDate = driver.findElement(By.xpath("html/body/div[1]/div/div/form/fieldset/label[3]/input"));
		startDate.sendKeys("1972-02-01");
		WebElement eMail = driver.findElement(By.xpath("html/body/div[1]/div/div/form/fieldset/label[4]/input"));
		eMail.sendKeys("test@gmail.com");
		WebElement addButton = driver.findElement(By.xpath("html/body/div[1]/div/div/form/fieldset/div/button[2]"));
		addButton.click();
		System.out.println("EMPLOYEE ADDED SUCCESSFULLLY");
		
		// EDIT AN EMPLOYEE PROFILE
        List <WebElement> rows = driver.findElements(By.xpath("//div[@id='employee-list-container']/ul/li")); 
        rows.size();
        System.out.println("Total No of Rows = " + rows);
        
        WebElement editEmp = driver.findElement(By.xpath("//div[@id='employee-list-container']/ul/li[2]"));
        editEmp.click();
        WebElement editButton = driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[2]/a"));
        editButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement editName = driver.findElement(By.xpath("html/body/div[1]/div/div/form/fieldset/label[1]/input"));
		editName.sendKeys("a");
		WebElement updateButton = driver.findElement(By.xpath("html/body/div[1]/div/div/form/fieldset/div/button[1]"));
		updateButton.click();
      	
		// LOGOUT THE APPLICATION
		WebElement logOut = driver.findElement(By.xpath("html/body/div[1]/header/div/p[1]"));
		logOut.click();
	}

}
