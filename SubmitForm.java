package com.cg.lesson05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SubmitForm {
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\poojasha\\Desktop\\Training Material\\Module-04\\Selenium Libraries\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.opencart.com/index.php?route=account/register");
		
		Thread.sleep(10000);

		driver.findElement(By.id("input-firstname")).sendKeys("Shubhasmit");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("input-lastname")).sendKeys("Gupta");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[type=submit]")).submit();
		
		Thread.sleep(5000);
		
		driver.quit();

	}
}
