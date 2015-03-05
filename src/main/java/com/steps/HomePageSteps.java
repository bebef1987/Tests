package com.steps;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.HomePage;


public class HomePageSteps extends ScenarioSteps{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1370017199400781239L;

	public HomePageSteps(Pages pages) {
		super(pages);
	}
	
	public HomePage homePage(){
		return getPages().currentPageAt(HomePage.class);
	}
}