package com.test.papercut.testCases;

import org.testng.annotations.Test;

import com.test.papercut.pages.DashboardPage;
import com.test.papercut.pages.LoginPage;
import com.test.papercut.testBase.TestBase;
import com.test.papercut.utility.Browser;
import com.test.papercut.utility.ConfigReader;

import junit.framework.Assert;

public class TC001_VerifyLoginAndDasboardLinks extends TestBase {
	
	ConfigReader reader= new ConfigReader() ;
	DashboardPage dashboardPage;
	LoginPage loginPage;
	
	
	@Test
	public void verifyLogin() {
		loginPage = new LoginPage(Browser.instance);
		dashboardPage=new DashboardPage(Browser.instance);
		loginPage.paperCutLogin(reader.userName(), reader.password());
		Assert.assertEquals(dashboardPage.getDashboarPAgeTitle(), reader.dahboardTitle());
		
		
	}
	
	@Test(priority=1)
	
	public void verifyDashBoardMenuLinks()
	{
		System.out.println("Value of reader" +reader.dashboardPageHeaderExpected() +"db page"+dashboardPage.getDashboarMenuHeader());
		Assert.assertEquals(dashboardPage.getDashboarMenuHeader(), reader.dashboardPageHeaderExpected());
	
		
	}

}
