package com.pages;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;

public class UnlockPage extends PageObject {

	private By serialNumber = By.cssSelector(".form-group input");
	private By agreeCheckbox = By.cssSelector(".table-default .ng-invalid-required");
	private By submitBtton = By.cssSelector(".btn.btn-default");
	
	public void enterSerialNumber(String serial) {
		element(serialNumber).waitUntilVisible();
		element(serialNumber).sendKeys(serial);
	}

	public void clickCheckbox(){
		element(agreeCheckbox).click();
	}

	public void clickSubmitButton(){
		element(submitBtton).waitUntilEnabled();
		element(submitBtton).click();
	}
}
