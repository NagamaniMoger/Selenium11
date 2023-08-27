package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {
	
	private String pageUrl = "http://the-internet.herokuapp.com/";
	
	private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
	
	public WelcomePageObject(WebDriver driver, Logger log) {
		super(driver, log);
	}

	//Open Welcome Page with it's url
	public void openPage() {
		log.info("Opening Page: " + pageUrl);
		//driver.get(pageUrl);
		openUrl(pageUrl);
		log.info("Page Opened");
	}
	
	//Open Login Page by clicking on Form Authentication Link
	public LoginPage clickFormAuthenticationLink() {
		log.info("Clicking Form Authentication Link on Welcome Page");
		//driver.findElement(formAuthenticationLinkLocator).click();
		click(formAuthenticationLinkLocator);
		return new LoginPage(driver,log);
	}
}
