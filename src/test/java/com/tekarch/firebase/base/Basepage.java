package com.tekarch.firebase.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// warning fatal bebug, info
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.tekarch.firebase.utilities.Constants;
import com.tekarch.firebase.utilities.PropertiesUtility;
import com.tekarch.firebase.utilities.constants;
public class Basepage extends BaseTest{
protected Logger BaseFirebasetlog=LogManager.getLogger();
	
	@BeforeMethod
	@Parameters("browserName")
	public void setUpBeforeMethod(@Optional("chrome") String name) {
		BaseFirebasetlog.info(".........BeforeMethod setUpBeforeMethod executed---------------");
		launchBrowser(name);
		String url=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"url");
		System.out.println('U'+url);
		goToUrl(url);
	}
	
	@AfterMethod
	public void tearDownAfterTestMethod() {
		closeBrowser();
		BaseFirebasetlog.info("******tearDownAfterTestMethod executed***********");
	}
	
	public void login_firebase() throws InterruptedException {
		
		
		String userName=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"username");
		String passWord=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"password");		
		Thread.sleep(5000);
		WebElement username= driver.findElement(By.id("email_field"));	
		enterText(username,userName,"username");
		WebElement password=driver.findElement(By.id("password_field"));
		enterText(password,passWord, "password");		
		WebElement loginButton= driver.findElement(By.tagName("button"));
		clickElement(loginButton, "loginbutton");
	}
}



	



