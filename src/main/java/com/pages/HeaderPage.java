package com.pages;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends PageObject{
	
	@FindBy(css = ".headerBorder")
	private WebElement loginButton;
	
	@FindBy(css = "#dropdownTopNavNetwork .overflow-ellipsis")
	private WebElement userName;

	/**
	 * Clicks on the "Login" button in the Header area
	 */
	public void clickLogin(){
		element(loginButton).waitUntilVisible();
		loginButton.click();
	}

	/**
	 * Checks that the UserName is visible in the Header area
	 */
	public void isUserNameVisibile(){
		element(userName).waitUntilVisible();
		element(userName).shouldBeVisible();
	}
}
