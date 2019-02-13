package com.cg.lesson05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HyperlinkDemo {
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\poojasha\\Desktop\\Training Material\\Module-04\\Selenium Libraries\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();

		String baseURL = "file:///C:/Users/poojasha/Desktop/Training Material/12thDec-VV-AT-ClassDemos/Lesson05ClassDemos/src/HyperlinkDemo.html";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		//Using linkText locator
		driver.findElement(By.linkText("CLICK HERE!")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		//Using partialLinkText locator
		driver.findElement(By.partialLinkText("ME")).click();

		System.out.println("The page title is : " + driver.getTitle());
		Thread.sleep(5000);
		driver.quit();

	}
}
