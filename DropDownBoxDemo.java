package com.cg.lesson05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownBoxDemo {
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\poojasha\\Desktop\\Training Material\\Module-04\\Selenium Libraries\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.opencart.com/index.php?route=account/register");
		
		Thread.sleep(5000);

		driver.findElement(By.id("input-firstname")).sendKeys("Shubhasmit");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-lastname")).sendKeys("Gupta");
		
		Thread.sleep(2000);
		
		Select selectCountry=new Select(driver.findElement(By.id("input-country")));
		
		selectCountry.selectByIndex(2);
		
		Thread.sleep(2000);
		
		selectCountry.selectByValue("38");
		
		Thread.sleep(2000);
		
		selectCountry.selectByVisibleText("India");
		
		Thread.sleep(2000);
		
		driver.quit();

	}
}
