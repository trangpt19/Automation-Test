package com.guru;

import org.junit.Assert;

import com.guru.steps.serenity.LoginGuruSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginGuruScenarioStep {

	@Steps
	LoginGuruSteps loginGuruStep;
	
	@Given("^I on the login homepage$")
	public void i_on_the_login_homepage() throws Throwable {
		loginGuruStep.open_home_page();
	}

	@When("^I click on account button$")
	public void i_click_on_account_button() throws Throwable {
		loginGuruStep.clickAccountLink();
	}

	@When("^I click on LOGIN item$")
	public void i_click_on_LOGIN_item() throws Throwable {
		loginGuruStep.clickLoginLink();
	}

	@When("^I input email \"([^\"]*)\"$")
	public void i_input_email(String arg1) throws Throwable {
		loginGuruStep.inputEmail(arg1);
	}

	@When("^I input password \"([^\"]*)\"$")
	public void i_input_password(String arg1) throws Throwable {
		loginGuruStep.inputPasswd(arg1);
	}

	@When("^I click on Login guru button$")
	public void i_click_on_Login_guru_button() throws Throwable {
		loginGuruStep.clickLoginButton();
	}
	
	@Then("^I should see alert message of email \"([^\"]*)\"$")
	public void i_should_see_alert_message_of_email(String errorMsg) throws Throwable {
		Assert.assertEquals(loginGuruStep.getAlertForEmail(), errorMsg);
	}

	@Then("^I should see alert message of passwd \"([^\"]*)\"$")
	public void i_should_see_alert_message_of_passwd(String arg1) throws Throwable {
		Assert.assertEquals(loginGuruStep.getAlertForPasswd(), arg1);
	}


}
