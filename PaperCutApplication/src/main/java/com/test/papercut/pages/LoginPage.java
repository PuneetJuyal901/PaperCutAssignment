	package com.test.papercut.pages;
	
	import org.apache.log4j.Logger;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	
	import com.test.papercut.utility.Browser;
	
	public class LoginPage extends BasePage{
		
	public static final Logger logger = Logger.getLogger(DashboardPage.class.getName());
		
		public LoginPage(WebDriver driver) {
			super(driver);
		}
		
		@FindBy(how= How.NAME, using ="inputUsername")
	    WebElement UserNameFied;
	
	    @FindBy(how= How.NAME, using ="inputPassword")
	    WebElement passwordField;
	
	    @FindBy(how= How.NAME, using ="$Submit$0")
		WebElement loginButton;
		
	
	
	
    public void paperCutLogin(String name,String password)
	{
		isvisible(UserNameFied,Browser.instance);
		UserNameFied.sendKeys(name);
		isvisible(passwordField,Browser.instance);
		passwordField.sendKeys(password);
		loginButton.click();	
		
	}
}


