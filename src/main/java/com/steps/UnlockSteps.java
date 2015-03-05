package com.steps;

import com.pages.UnlockPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class UnlockSteps extends ScenarioSteps {

	public UnlockSteps(Pages pages) {
		super(pages);
	}

	public UnlockPage unlockPage(){
		return getPages().currentPageAt(UnlockPage.class);
	}

	@Step
	public void enterSerialNumber(String serial){
		unlockPage().enterSerialNumber(serial);
	}

	@Step
	public void clickCheckbox(){
		unlockPage().clickCheckbox();
	}

	@Step
	public void clickSubmit(){
		unlockPage().clickSubmitButton();
	}
}
