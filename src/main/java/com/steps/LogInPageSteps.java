package com.steps;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LogInPage;

public class LogInPageSteps extends ScenarioSteps{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1023139860877380003L;

	public LogInPageSteps(Pages pages) {
		super(pages);
	}

//	Login Page
	public LogInPage logInPage(){
		return getPages().currentPageAt(LogInPage.class);
	}

	@StepGroup
    public void loginWithCredentials(String email, String password){
		inputEmail(email);
		inputPassword(password);
		clickSubmit();
	}

	@Step
	public void inputEmail(String emailAddress){
		logInPage().inputEmail(emailAddress);
	}

	@Step
	public void inputPassword(String password){
		logInPage().inputPassword(password);
	}

	@Step
	public void clickSubmit(){
		logInPage().clickSubmit();
	}
}
