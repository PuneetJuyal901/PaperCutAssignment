package com.test.papercut.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public  static WebDriver instance;
	ConfigReader reader= new ConfigReader();

	public static void setup(String url, String browserName) {
		 {
		
		if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			instance = new FirefoxDriver();
			instance.get(url);
			instance.manage().window().maximize();

		}

		else if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			instance = new ChromeDriver();
			instance.get(url);
			instance.manage().window().maximize();

		}

		else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			instance = new InternetExplorerDriver();
			instance.get(url);
			instance.manage().window().maximize();
			
		}
		else if(browserName.equalsIgnoreCase("safari"))
		{
			WebDriverManager.iedriver().setup();
			instance = new SafariDriver();
			instance.get(url);
			instance.manage().window().maximize();
			
		}}}
		
		
		
		public  static void destroy() {
			     
			instance.quit();
			instance=null;
				
		}	

}
