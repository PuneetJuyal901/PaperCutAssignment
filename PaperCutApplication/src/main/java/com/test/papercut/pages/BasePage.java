package com.test.papercut.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.papercut.utility.Browser;

public class BasePage {
	
	public static final Logger logger = Logger.getLogger(BasePage.class.getName());
	
	public BasePage(WebDriver driver) {
		Browser.instance=driver;
		PageFactory.initElements(Browser.instance, this); 
		
      
	}
	

	public  boolean isClickable(WebElement element,  WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(Browser.instance,20);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			logger.info("Element which is not clickable is" +e.getMessage());
			return false;
		}
	}
	
	public  boolean isStale(WebElement element, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(Browser.instance, 20);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception StaleElementReferenceException) {
			Browser.instance.navigate().refresh();
			logger.info("Element which is not clickable is" + element.toString());
			return false;
		}
	}

	public boolean  isvisible(WebElement element, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(Browser.instance, 20);
			wait.until(ExpectedConditions.visibilityOf((element))); 
			return true;

		} catch (Exception e) {
			logger.info("Element not visible is " +e.getMessage());
			return false;
		}
	}

	public  boolean isNotVisible(WebElement element,WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(Browser.instance,20);
			wait.until(ExpectedConditions.invisibilityOf(element));
			return true;
		} catch (Exception e) {
			logger.info("Element which is not  visible is " +e.getMessage());
			return false;
		}
	}

	public  boolean isElementPresent(WebElement element, WebDriver driver ) {
		try {

			element.isDisplayed();
			return true;

		} catch (Exception e) {
			logger.info("Element which is not  displayed  is " +e.getMessage());
			return false;
		}
	}}
