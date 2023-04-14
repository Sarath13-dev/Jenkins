package org.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {
	
	@Test
	private void tc0() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		System.out.println("New Commit");
		System.out.println("New Commit");
		System.out.println("Hiw How are you");
		System.out.println("Heelow");
	}
	
	
	}
