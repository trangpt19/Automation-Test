package com.guru.steps.serenity;

import com.guru.pages.LoginGuruPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginGuruSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LoginGuruPage loginGuruPage;

	@Step
	public void open_home_page() {
		loginGuruPage.open();
	}

	@Step
	public void clickAccountLink() {
		loginGuruPage.clickAccountLink();

	}

	@Step
	public void clickLoginLink() {
		loginGuruPage.clickLoginLink();
	}

	@Step
	public void inputEmail(String arg1) {
		loginGuruPage.inputEmail(arg1);
	}

	@Step
	public void inputPasswd(String arg1) {
		loginGuruPage.inputPasswod(arg1);
	}

	@Step
	public String getAlertForEmail() {
		return loginGuruPage.getAlertForEmail();
	}

	@Step
	public void clickLoginButton() {
		loginGuruPage.clickLoginBtn();
	}
	@Step
	public String getAlertForPasswd() {
		return loginGuruPage.getAlertForPasswd();
	}

}
