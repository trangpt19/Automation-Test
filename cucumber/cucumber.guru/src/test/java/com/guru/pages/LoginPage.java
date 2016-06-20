package com.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://accounts.google.com")
public class LoginPage extends PageObject {

	@FindBy(id = "Email")
	WebElement emailField;

	@FindBy(id = "errormsg_0_Passwd")
	WebElement emailErroMsgField;
	
	@FindBy(id = "errormsg_0_Passwd")
	WebElement submitBtn;

	public void inputEmail(String email) {
		emailField.sendKeys(email);

	}

	public String getErrorMsg() {
		return emailErroMsgField.getText();
	}

	public void clickSubmitBtn() {
		submitBtn.click();
	}

}
