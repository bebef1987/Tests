package com.tests;
import java.util.Arrays;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.requirements.Mimosa;
import com.pages.HomePage;
import com.pages.ProductsPage;
import com.steps.HeaderSteps;
import com.steps.HomePageSteps;
import com.steps.LogInPageSteps;
import com.steps.ProductsSteps;

@RunWith(ThucydidesRunner.class)
@Story(Mimosa.HomePage.Products.class)
public class TestHomePageProducts {
	
	@Managed(uniqueSession = false)
    public WebDriver webdriver;
	
	@ManagedPages(defaultUrl = "http://mimosa.co/")
	public Pages pages;

	@Steps
    public HeaderSteps headerSteps;
	
	@Steps
	public ProductsSteps productsSteps;
 
	@Steps
	public HomePageSteps homeSteps;

	@Test
    public void openProductsPage(){
		homeSteps.openHomePage();
		headerSteps.clickProductsButton();
		productsSteps.checkBanner("Products");
	}

	@Test
	@Pending
    public void checkRelatedDocuments(){
	}

	@Test
	@Pending
	public void checkAllProducts(){
	}

	@Test
    public void checkBackhaul(){
		headerSteps.clickProductsButton();
		productsSteps.clickBlackhaul();
		productsSteps.checkBackhaulProductView("BACKHAUL", 3,  Arrays.asList("B5 INTEGRATED", "B5c CONNECTORIZED", "B5-LITE"));
	}

	@Test
	@Pending
	public void checkAccessPoints(){

	}

	@Test
	@Pending
	public void checkClient(){

	}
}
