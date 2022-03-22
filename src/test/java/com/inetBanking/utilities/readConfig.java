package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	
	Properties pro;
	public readConfig() {
		
		File src=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
			
		}
	}
	
	public String getApplicationURL() {
		
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUserName() {
		String uname=pro.getProperty("userName");
		return uname;
	}
	public String getPassword() {
		String passWrd=pro.getProperty("password");
		return passWrd;
	}
	
	public String getChromePath() {
		String chropath=pro.getProperty("chromepath");
		return chropath;
	}
	public String getFirefoxpath() {
		String firepath=pro.getProperty("firefoxpath");
		return firepath;
	}
}
