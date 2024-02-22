package com.salesforce.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Listeners;

import com.tekarch.firebase.utilities.ExtentReportsUtility;

public class SFDCBasePage {
	public WebDriver driver = null;
	protected Wait<WebDriver> wait = null;
	protected Logger baseTestlog=LogManager.getLogger();
	protected ExtentReportsUtility extentReport=ExtentReportsUtility.getInstance();
	
	
	public  SFDCBasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterText(WebElement ele, String data, String objectName) {
		if (ele.isDisplayed()) {
			ele.clear();
			ele.sendKeys(data);
			baseTestlog.info("data is entered in " + objectName + " textbox");
			extentReport.logTestInfo("data is entered in " + objectName + " textbox");
			
		} else {
			baseTestlog.info(objectName + " element is not displayed");
		}
	}
	
	public void clickElement(WebElement ele, String objectName) {
		if (ele.isEnabled()) {
			ele.click();
			baseTestlog.info(objectName + "button is clicked");
			extentReport.logTestInfo(objectName + "button is clicked");
			
		} else {
			baseTestlog.info(objectName+" element is not enabled");
			
		}
	}
	
	public String getTextFromElement(WebElement ele, String objectName) {
		String data = ele.getText();
		baseTestlog.info("text is extracted from "+objectName);
		extentReport.logTestInfo("text is extracted from "+objectName);
		return data;
	}
	public void movetoElement (WebElement ele, String objectname) {
		baseTestlog.info("object is moved "+ objectname);
		extentReport.logTestInfo(objectname);
	}
	
}
