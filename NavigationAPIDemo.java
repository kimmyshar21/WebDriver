package com.cg.lesson05;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationAPIDemo {
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\poojasha\\Desktop\\Training Material\\Module-04\\Selenium Libraries\\chromedriver_win32\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
					
		driver.get("http://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		//OR
		driver.navigate().to("http://demo.opencart.com/index.php?route=product/category&path=57");
				
		Thread.sleep(5000);
			
		driver.navigate().refresh();
				
		Thread.sleep(5000);
				
		driver.navigate().back();
				
		Thread.sleep(5000);
				
		driver.navigate().forward();
				
		Thread.sleep(5000);
				
		driver.quit();

	}
}
