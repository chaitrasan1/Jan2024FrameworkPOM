package com.salesforce.pages.login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.SFDCBasePage;

public class SFDCLoginPage extends SFDCBasePage {
	@FindBy(id = "username")WebElement userID;
	@FindBy(id = "password")WebElement password;
	@FindBy(name = "Login")WebElement loginButton;
	@FindBy(name="rememberUn")WebElement remMe;
	@FindBy(id="forgot_password_link")WebElement forgotbutton;
	@FindBy(id = "error")WebElement errormessage;
	@FindBy(id="un")WebElement forgotpasswordusername;	
	@FindBy(id = "continue")WebElement continuebutton;
	@FindBy(id="header")WebElement CheckYourEmail;
	
	
	
	
	
public  SFDCLoginPage(WebDriver driver) {
	super(driver);
}
public void enterUserName(String data) {
	//userNameElement.sendKeys(data);
	enterText(userID, data, "Username textbox");
	//extentReport.logTestInfo("userID data is entered in userID field");
}
public void enterPassword(String data) {
	enterText(password, data, "password field");
}
public WebDriver clickLoginButton() {
	clickElement(loginButton,"login button");
	return driver;
}
public WebDriver forgotpassword() {
	clickElement(forgotbutton,"forgot_password_link");
	return driver;
}

public void forgotUserName(String data) {
	enterText(forgotpasswordusername, data,"un");
	
}
public WebDriver continuebutton1() {
	clickElement(continuebutton,"continue");
	return driver;
}
public String getTextFromElement() {
 return getTextFromElement(errormessage,"error");
 }
public String header() {
	return getTextFromElement(CheckYourEmail,"header");

	
}


 




/*public String getTitleOfThePage() {
	//waitUntilPageLoads();
	return getPageTitle();
}
public Alert switchToErrorAlert() {
	return switchToAlert();
}
public String extractTextFromAlert(Alert a) {
	return getAlertText(a,"LOginError Alert");
}
public void acceptErrorAlert(Alert a) {
	AcceptAlert(a);
}

*/
}
