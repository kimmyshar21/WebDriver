package com.cg.lesson5;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class TestWebDriverTSChrome {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("Hello Selenium!!");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\poojasha\\Desktop\\Training Material\\Module-04\\Selenium Libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver.close();

	}

}
