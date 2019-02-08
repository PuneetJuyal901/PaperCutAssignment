package com.test.papercut.testBase;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;

import com.test.papercut.utility.Browser;
import com.test.papercut.utility.ConfigReader;


public class TestBase {
	
	public  static final Logger  logger = Logger.getLogger(TestBase.class.getName());
	ConfigReader reader;
	
	
	@BeforeTest(alwaysRun = true)
	public void browserIntialization() {
		reader=new ConfigReader();
		Browser.setup(reader.url(), reader.browserName());
		
		logger.info("......................Browser started......................................");
	}

}
