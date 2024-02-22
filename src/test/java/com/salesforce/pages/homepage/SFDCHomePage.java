package com.salesforce.pages.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.SFDCBasePage;

public class SFDCHomePage extends SFDCBasePage{
	@FindBy(id= "userNavButton")WebElement usermenu;
	@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[5]")WebElement logout;
	
public  SFDCHomePage(WebDriver driver) {
super(driver);
}

public WebDriver usermenudropdown() {
movetoElement(usermenu,  "userNavButton") ;
return driver;
	
}
public WebDriver clickButton() {
	clickElement(usermenu,  "userNavButton");
	
	return driver;
}
public WebDriver logoutbutton() {
	clickElement(logout,"logout");
	return driver;
}

	
}
	
