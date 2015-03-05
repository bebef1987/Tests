package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At("#HOST/")
public class HomePage extends PageObject{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
}
