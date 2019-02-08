package com.test.papercut.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.test.papercut.utility.Browser;

public class DashboardPage extends BasePage{
	
public static final Logger logger = Logger.getLogger(DashboardPage.class.getName());
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how= How.CSS, using ="span[title='Dashboard']")
	WebElement dashboardHeader;
	
	@FindBy(how= How.XPATH, using ="//*[@id=\"mainnav\"]/ul/li[1]/div/a/span[2]/span")
	WebElement dashboardMenu;
	

	


public String getDashboarPAgeTitle()
{
	isvisible(dashboardHeader,Browser.instance);
	return Browser.instance.getTitle();
}

public String getDashboarMenuHeader()
{
	isvisible(dashboardMenu, Browser.instance);
	dashboardMenu.click();
	isvisible(dashboardHeader, Browser.instance);
	return dashboardHeader.getText();
}

}
