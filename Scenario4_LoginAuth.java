package com.emishealthindia.scenarios;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario4_LoginAuth {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		Runtime.getRuntime().exec("D:\\WinAuth_IE.exe");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
