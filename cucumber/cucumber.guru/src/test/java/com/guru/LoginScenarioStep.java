package com.guru;

import org.junit.Assert;

import com.guru.steps.serenity.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginScenarioStep {
	@Steps
	LoginSteps loginStep;
	
	@Given("^I am on HomePage$")
	public void i_am_on_HomePage() throws Throwable {
		loginStep.open_homePage();
	}

	@When("^I input my account is \"([^\"]*)\"$")
	public void i_input_my_account_is(String arg1) throws Throwable {
		loginStep.inputEmail(arg1);
	}

	@Then("^I should see alert msg \"([^\"]*)\"$")
	public void i_should_see_alert_msg(String msg) throws Throwable {
		Assert.assertEquals(loginStep.getAlertMsg(), msg);
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		loginStep.clickSubmit();
	}

}
