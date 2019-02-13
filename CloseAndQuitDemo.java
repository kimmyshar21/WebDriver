package com.cg.lesson05;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CloseAndQuitDemo {
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\poojasha\\Desktop\\Training Material\\Module-04\\Selenium Libraries\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/popuptest2.html");
		Thread.sleep(10000);
				
	    //using QUIT all windows will close
	    driver.quit();
				
		//using close will close current window
	    //driver.close();
	}
}
