package com.vaddi.java.automation.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		WebDriver driver = (WebDriver) new ChromeDriver();

		driver.get("http://jsbin.com/usidix/1");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		String a = driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		
		System.out.println("Message is :" + a);
				  

		Thread.sleep(5000);  // Let the user actually see something!     

		driver.quit();  
		
		String mainWindow = driver.getWindowHandle();
		
		Set<String> wins = driver.getWindowHandles();
		Iterator <String> i = wins.iterator();
		while(i.hasNext()) {
			
			if(!mainWindow.equalsIgnoreCase(i.next())) {
				driver.switchTo().window(i.next());
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		driver.quit();

	}

}
