package com.steps;

import org.openqa.selenium.remote.server.handler.SwitchToFrame;

import com.pages.HeaderPage;
import com.pages.ProductsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class HeaderSteps extends ScenarioSteps{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5719136401926674833L;

	public HeaderSteps(Pages pages) {
		super(pages);
	}

	//	Header
	public HeaderPage headerPage(){
		return getPages().currentPageAt(HeaderPage.class);
	}

	@Step
	public void clickLoginButton(){
		headerPage().clickLogin();
	}
	
	@Step
	public void checkUserIsLoggedIn(){
		headerPage().isUserNameVisibile();
	}
	
	@Step 
	public void clickProductsButton(){
		ProductsPage productsPage = headerPage().clickProductsButton();
		productsPage.shouldBeDisplayed();
	}
}
