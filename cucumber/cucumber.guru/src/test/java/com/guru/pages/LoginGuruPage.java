package com.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://live.guru99.com")

public class LoginGuruPage extends PageObject{
	
	@FindBy(id="")//chua lay dc 
	WebElement accountItem;
	
	@FindBy(id="")//chua lay dc
	WebElement loginItem;
	
	@FindBy(id="email")
	WebElement emailField;
	
	@FindBy(id="pass")
	WebElement passwordField;
	
	@FindBy(id="send2")
	WebElement loginButton;
	
	@FindBy(id="advice-required-entry-email")
	WebElement emailErrMsg;
	
	@FindBy(id="advice-required-entry-email")
	WebElement passwdErrMsg;

	public void clickAccountLink() {
		accountItem.click();
	}

	public void clickLoginLink() {
		loginItem.click();
	}

	public void inputEmail(String arg1) {
		emailField.sendKeys(arg1);
	}

	public void inputPasswod(String arg1) {
		passwordField.sendKeys(arg1);
	}

	public String getAlertForEmail() {
		return emailErrMsg.getText();
	}

	public void clickLoginBtn() {
		loginButton.click();		
	}

	public String getAlertForPasswd() {
		return passwdErrMsg.getText();
	}

}
