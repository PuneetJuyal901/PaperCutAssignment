	package com.test.papercut.utility;
	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	
	public class ConfigReader {
		
		Properties prop;
		FileInputStream fis=null;
		
		public ConfigReader() 
		{
			
		
			try {
				File src= new File(System.getProperty("user.dir")+"//configuration//config.property");
				  fis= new FileInputStream(src);
				 prop= new Properties(); 
				
				 
				prop.load(fis); 
			}
				catch (Exception e) {
					
				     System.out.println("Exception is" +e.getMessage());
				}
				     
				     finally {
				    	    if (fis != null) {
				    	        try {
				    	        	fis.close();
				    	        } catch (IOException e) {
				    	            
				    	            e.printStackTrace();
				    	        }
				    	    }
				}}
		
		public String userName()
		{
			return prop.getProperty("UserName");
		}
		
		public String password()
		{
			return prop.getProperty("Password");
		}
		
		public String url () {
			return prop.getProperty("Url");
		}
		
		public String browserName() {
			return prop.getProperty("BrowserName");
		}
		
		public String dahboardTitle() {
			return prop.getProperty("DashBoaePageTitle");
		}
		
		public String dashboardPageHeaderExpected() {
			return prop.getProperty("dashBoardPageHeader");
		}
	
	}
