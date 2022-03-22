package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException {
		
		//driver.get(baseURL);
		logger.info("URL Opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("user name entered");
		lp.setPassword(password);
		logger.info("password entered");
		lp.clickSubmit();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("testcase passed");
		}
		else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
		}
	}
	

}
