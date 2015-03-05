package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At("#HOST/app/welcome.html#/login")
public class LogInPage extends PageObject{

	public LogInPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="InputFieldLogin")
	private WebElement emailInput;

	@FindBy(id="password")
	private WebElement passwordInput;

	@FindBy(css=".btn-submitWelcome")
	private WebElement submitButton;

	/**
	 * Inserts the user's email
	 * 
	 * @param emailAddress
	 */
	public void inputEmail(String emailAddress){
		element(emailInput).waitUntilVisible();
		emailInput.sendKeys(emailAddress);
	}

	/**
	 * Inserts the user's password
	 * 
	 * @param password
	 */
	public void inputPassword(String password){
		element(passwordInput).waitUntilVisible();
		passwordInput.sendKeys(password);
	}

	/**
	 * Clicks on the "Submit" button
	 */
	public void clickSubmit(){
		element(submitButton).waitUntilVisible();
		submitButton.click();
	}
}
