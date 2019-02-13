package com.cg.lesson5;
import org.openqa.selenium.*;

import org.openqa.selenium.ie.*;
public class TestWebDriverTSIE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello Selenium!!");
		System.setProperty("webdriver.ie.driver","C:\\Users\\poojasha\\Desktop\\Training Material\\Module-04\\Selenium Libraries\\IEDriverServer_x64_3.5.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver.close();
	}

}
