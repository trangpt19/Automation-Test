package com.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://live.guru99.com")
public class RegisterGuruPage extends PageObject {
	@FindBy(className="welcome-msg")
	WebElement welcomeErrMsg;
	
	@FindBy(id = "Register") // xem lai cho nay
	WebElement registerBtn;
	
	@FindBy(id = "")
	WebElement createLink;

	@FindBy(id = "firstname")
	WebElement firstNameField;

	@FindBy(id = "lastname")
	WebElement lastNameField;

	@FindBy(id = "email_address")
	WebElement emailField;

	@FindBy(id = "password")
	WebElement passwdField;

	@FindBy(id = "confirmation")
	WebElement confirmPasswdField;

	@FindBy(id = "advice-required-entry-firstname")
	WebElement firstNameErrMsg;

	@FindBy(id = "advice-required-entry-lastname")
	WebElement lastNameErrMsg;

	@FindBy(id = "advice-required-entry-email_address")
	WebElement emailErrMsg;

	@FindBy(id = "advice-required-entry-password")
	WebElement passwdErrMsg;
	@FindBy(id = "advice-validate-password-password")
	WebElement validatePasswd;

	@FindBy(id = "advice-required-entry-confirmation")
	WebElement confirmPasswdErrMsg;

	@FindBy(id = "advice-validate-cpassword-confirmation")
	WebElement matchingErrMsg;

	public String getMatchingErrMsg() {
		return matchingErrMsg.getText();
	}

	public void clickCreateLink() {
		createLink.click();
	}

	public void inputFirstName(String arg1) {
		firstNameField.sendKeys(arg1);
	}

	public void inputLastName(String arg1) {
		lastNameField.sendKeys(arg1);
	}

	public void inputPasswd(String arg1) {
		passwdField.sendKeys(arg1);
	}

	public void inputConfirmPasswd(String arg1) {
		confirmPasswdField.sendKeys(arg1);
	}

	public void clickRegisterBtn() {
		registerBtn.click();
	}

	public String getWelcomErrMsg() {

		return welcomeErrMsg.getText();
	}

	public String getFirstnameErrMsg() {

		return firstNameErrMsg.getText();
	}

	public String getLastnameErrMsg() {
		return lastNameErrMsg.getText();
	}

	public String getEmailErrMsg() {

		return emailErrMsg.getText();
	}

	public String getPasswdErrMsg() {

		return passwdErrMsg.getText();
	}

	public String getConfirmPasswdErrMsg() {

		return confirmPasswdErrMsg.getText();
	}

	public void inputEmailRegister(String arg1) {
		emailField.sendKeys(arg1);

	}

	public String getValidatePasswdErrMsg() {
		return validatePasswd.getText();
	}

}
