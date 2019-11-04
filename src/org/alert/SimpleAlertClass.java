package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\091819\\AlertPratice\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	Alert al = driver.switchTo().alert();
	al.accept();
	
	}
}
