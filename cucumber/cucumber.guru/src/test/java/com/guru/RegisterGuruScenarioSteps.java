package com.guru;

import org.junit.Assert;

import com.guru.steps.serenity.RegisterGuruSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterGuruScenarioSteps {
	@Steps
	RegisterGuruSteps registerStep;
	
	@When("^I click create account link$")
	public void i_click_create_account_link() throws Throwable {
		registerStep.clickCreateLink();
	}

	@When("^I input first name \"([^\"]*)\"$")
	public void i_input_first_name(String arg1) throws Throwable {
		registerStep.inputFirstName(arg1);
	}

	@When("^I input last name \"([^\"]*)\"$")
	public void i_input_last_name(String arg1) throws Throwable {
		registerStep.inputLastName(arg1);
	}

	@When("^I input email register \"([^\"]*)\"$")
	public void i_input_email_register(String arg1) throws Throwable {
		registerStep.inputEmailRegister(arg1);
	}

	@When("^I input passwd \"([^\"]*)\"$")
	public void i_input_passwd(String arg1) throws Throwable {
		registerStep.inputPasswd(arg1);
	}

	@When("^I input confirm passwd \"([^\"]*)\"$")
	public void i_input_confirm_passwd(String arg1) throws Throwable {
		registerStep.inputConfirmPasswd(arg1);
	}

	@When("^I click Register button$")
	public void i_click_Register_button() throws Throwable {
		registerStep.clickRegisterBtn();
	}

	@Then("^I should see welcome message \"([^\"]*)\"$")
	public void i_should_see_welcome_message(String arg1) throws Throwable {
		Assert.assertEquals(registerStep.getWelcomErrMsg(), arg1);
	}

	@Then("^I should see the error message of first name \"([^\"]*)\"$")
	public void i_should_see_the_error_message_of_first_name(String arg1) throws Throwable {
		Assert.assertEquals(registerStep.getFirstnameErrMsg(), arg1);
	}

	@Then("^I should see the error message of last name \"([^\"]*)\"$")
	public void i_should_see_the_error_message_of_last_name(String arg1) throws Throwable {
		Assert.assertEquals(registerStep.getLastnameErrMsg(), arg1);
	}

	@Then("^I should see the error message of email \"([^\"]*)\"$")
	public void i_should_see_the_error_message_of_email(String arg1) throws Throwable {
		Assert.assertEquals(registerStep.getEmailErrMsg(), arg1);
	}

	@Then("^I should see the error message of passwd \"([^\"]*)\"$")
	public void i_should_see_the_error_message_of_passwd(String arg1) throws Throwable {
		Assert.assertEquals(registerStep.getPasswdErrMsg(), arg1);
	}
	
	@Then("^I should see the error message of validate passwd \"([^\"]*)\"$")
	public void i_should_see_the_error_message_of_validate_passwd(String arg1) throws Throwable {
		Assert.assertEquals(registerStep.getValidatePasswdErrMsg(), arg1);
	}

	@Then("^I should see the error message of confirm passwd \"([^\"]*)\"$")
	public void i_should_see_the_error_message_of_confirm_passwd(String arg1) throws Throwable {
		Assert.assertEquals(registerStep.getConfirmPasswdErrMsg(), arg1);
	}

	@Then("^I should see the error message of matching passwd \"([^\"]*)\"$")
	public void i_should_see_the_error_message_of_matching_passwd(String arg1) throws Throwable {
		Assert.assertEquals(registerStep.getMatchingErrMsg(), arg1);
	}

}
