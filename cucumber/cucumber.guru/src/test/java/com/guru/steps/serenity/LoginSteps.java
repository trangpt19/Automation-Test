package com.guru.steps.serenity;

import com.guru.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LoginPage loginPage;

	@Step
	public void open_homePage() {
		loginPage.open();
	}

	@Step
	public void inputEmail(String email) {
		loginPage.inputEmail(email);
	}

	@Step
	public String getAlertMsg() {
		return loginPage.getErrorMsg();
	}

	@Step
	public void clickSubmit() {
		loginPage.clickSubmitBtn();
	}

}
