package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertClass {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\DELL\\eclipse-workspace\\091819\\AlertPratice\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("welcome");
	//alert.accept();
	Thread.sleep(3000);
	String s = alert.getText();
	System.out.println(s);
	alert.accept();
}
}