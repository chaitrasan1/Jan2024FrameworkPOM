package com.salesforce.automationtests;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.salesforce.base.SFDCBaseTest;
import com.salesforce.pages.homepage.SFDCHomePage;
import com.salesforce.pages.login.SFDCLoginPage;

import com.tekarch.firebase.utilities.PropertiesUtility;
import com.tekarch.firebase.utilities.constants;

public class SFDCLoginAutomationScripts extends SFDCBaseTest{
	
	protected Logger AutomationScriptslog=LogManager.getLogger();
	
	@Test
	public void succesLogin() throws InterruptedException {
		AutomationScriptslog.info("******login_to_firebase automation script started***********");
		
		String userName=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"SFDCusername");
		String passWord=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"SFDCpassword");	
		extentReport.logTestInfo("username and password extracted from properties file");
		
		SFDCLoginPage loginPage= new SFDCLoginPage(driver);
		loginPage.enterUserName(userName);
		loginPage.enterPassword(passWord);
		driver=loginPage.clickLoginButton();
		
		
		
	}
	@Test
	public void case1() {
		AutomationScriptslog.info("******login_to_firebase automation script started***********");
		
		String userName=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"SFDCusername");
		extentReport.logTestInfo("username and password extracted from properties file");
		
		SFDCLoginPage loginPage= new SFDCLoginPage(driver);
		loginPage.enterUserName(userName);
		driver=loginPage.clickLoginButton();
		loginPage.getTextFromElement();
		
		
	}
	@Test
	public void case3() {
AutomationScriptslog.info("******login_to_firebase automation script started***********");
		
		String userName=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"SFDCusername");
		String passWord=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"SFDCpassword");	
		extentReport.logTestInfo("username and password extracted from properties file");
		
		SFDCLoginPage loginPage= new SFDCLoginPage(driver);
		SFDCHomePage homepage = new SFDCHomePage(driver);
		
		loginPage.enterUserName(userName);
		loginPage.enterPassword(passWord);
		driver=loginPage.clickLoginButton();
		homepage.usermenudropdown();
		homepage.clickButton();
		homepage.logoutbutton();
		
		
	}
	@Test
	public void case4() {
		AutomationScriptslog.info("******login_to_firebase automation script started***********");
		
		String userName=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"SFDCusername");
		extentReport.logTestInfo("username is extracted from properties file");
		
		
		SFDCLoginPage loginPage= new SFDCLoginPage(driver);
		loginPage.forgotpassword();
		loginPage.forgotUserName(userName);
		loginPage.continuebutton1();
		loginPage.header();
		
	}
	@Test
	
	public void case4B() {
		AutomationScriptslog.info("******login_to_firebase automation script started***********");
		
		
		String userName=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"SFDCusername");
		extentReport.logTestInfo("username is extracted from properties file");
		
		SFDCLoginPage loginPage= new SFDCLoginPage(driver);
		loginPage.enterUserName(userName);
		
	}
}
