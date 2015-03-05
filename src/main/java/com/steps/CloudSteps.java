package com.steps;

import com.pages.CloudPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CloudSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CloudSteps(Pages pages) {
		super(pages);
	}

	public CloudPage cloudPage(){
		return getPages().currentPageAt(CloudPage.class);
	}

	@Step
	public void closePopup(){
		cloudPage().closeButton();
	}
	
	@Step
	public void searchLocation(String search_term){
		cloudPage().search(search_term);
	}
	
	@Step
	public void selectSecondPosition(){
		cloudPage().select_second_position();
	}

	@Step
	public void clickDesign(){
		cloudPage().clickDesign();
	}
	
	@Step
	public boolean isChartVisible(){
		return cloudPage().is_map_chart_visible();
	}
	
	@Step
	public String obstructionsText(){
		return cloudPage().obstructionsText();
	}

	public void clickUnlock() {
		cloudPage().clickUnlock();
	}
}
