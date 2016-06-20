package com.guru.steps.serenity;

import com.guru.pages.RegisterGuruPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RegisterGuruSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RegisterGuruPage registerPage;

	@Step
	public void clickCreateLink() {
		registerPage.clickCreateLink();
	}

	@Step
	public void inputFirstName(String arg1) {
		registerPage.inputFirstName(arg1);
	}

	@Step
	public void inputLastName(String arg1) {
		registerPage.inputLastName(arg1);
	}

	@Step
	public void inputPasswd(String arg1) {
		registerPage.inputPasswd(arg1);
	}

	@Step
	public void inputConfirmPasswd(String arg1) {
		registerPage.inputConfirmPasswd(arg1);
	}

	@Step
	public void clickRegisterBtn() {
		registerPage.clickRegisterBtn();
	}

	@Step
	public String getWelcomErrMsg() {
		return registerPage.getWelcomErrMsg();
	}

	@Step
	public String getFirstnameErrMsg() {
		return registerPage.getFirstnameErrMsg();
	}

	@Step
	public String getLastnameErrMsg() {
		return registerPage.getLastnameErrMsg();
	}

	@Step
	public String getEmailErrMsg() {
		return registerPage.getEmailErrMsg();
	}

	@Step
	public String getPasswdErrMsg() {
		return registerPage.getPasswdErrMsg();
	}

	@Step
	public String getConfirmPasswdErrMsg() {
		return registerPage.getConfirmPasswdErrMsg();
	}

	@Step
	public String getMatchingErrMsg() {
		return registerPage.getMatchingErrMsg();
	}

	@Step
	public void inputEmailRegister(String arg1) {
		registerPage.inputEmailRegister(arg1);
	}

	@Step
	public String getValidatePasswdErrMsg() {
		return registerPage.getValidatePasswdErrMsg();
	}

}
