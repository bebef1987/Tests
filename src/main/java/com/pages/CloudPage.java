package com.pages;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;

public class CloudPage extends PageObject {

	private By designTool = By.cssSelector(".col-md-4:nth-child(2) .toolBox a");
	private By unlockDevice = By.cssSelector(".col-md-4:nth-child(1) .toolBox a");
	private By closePopupButton = By.cssSelector(".btn.btn-gray.pull-right");
	private By searchField = By.id("searchText");
	private By firstPoint = By.cssSelector(".gmnoprint > img");
	private By fullMap = By.cssSelector(".gm-style>div>div[style*='height: 100%']");
	private By secondPoint = By.cssSelector(".control>a[onclick*='ext_newLinkB']");
	private By mapChart = By.cssSelector("#db-elevation_chart > div");
	private By obstructionsText = By.cssSelector("td:nth-child(2) .fontsize-18.ng-binding");
	
	public void clickDesign(){
		element(designTool).waitUntilVisible();
		element(designTool).click();
	}
	
	public void clickUnlock(){
		element(unlockDevice).waitUntilVisible();
		element(unlockDevice).click();
	}

	public void closeButton(){
		element(closePopupButton).waitUntilVisible();
		element(closePopupButton).click();
	}
	
	public void search(String search_term){
		element(searchField).waitUntilVisible();
		element(searchField).sendKeys(search_term);
		element(searchField).sendKeys(Keys.ENTER);
	}

	public Point get_first_point_position() {
		return element(firstPoint).getLocation();
	}

	public void select_second_position() {
		Actions actions = new Actions(getDriver());
		actions.moveByOffset(get_first_point_position().getX() + 120, get_first_point_position().getY() + 100);
		actions.contextClick(element(fullMap)).perform();
		element(secondPoint).click();
	}
	
	public boolean is_map_chart_visible() {
		return element(mapChart).isDisplayed();
	}
	
	public String obstructionsText() {
		return element(obstructionsText).getText();
	}
}