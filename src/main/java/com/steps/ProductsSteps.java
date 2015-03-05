package com.steps;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pages.HeaderPage;
import com.pages.ProductsPage;
import com.pages.ProductsPage.Product;
import com.pages.ProductsPage.ProductGroup;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;


public class ProductsSteps extends ScenarioSteps{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductsSteps(Pages pages) {
		super(pages);
	}
	
	public ProductsPage productsPage(){
		return getPages().currentPageAt(ProductsPage.class);
	}
	
	@Step
	public void checkBanner(String banner){
		assertEquals(productsPage().bannerTitleText(), banner);
	}
	
	@Step
	public void clickBlackhaul(){
		productsPage().clickBackhaulButton();
	}
	
	@Step
	public void checkBackhaulProductView(String name, int productCount, List<String> productList){
		ProductGroup backhaulProducts = productsPage().backhaulProducts();
		
		assertTrue(backhaulProducts.isVisibile());
		assertEquals(productCount, backhaulProducts.products().size());
		
		for (Product product: backhaulProducts.products()){
			assertThat(productList, hasItem(product.text()));
		}
		
	}
}
