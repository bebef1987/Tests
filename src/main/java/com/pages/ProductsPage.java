package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@At("#HOST/product.html")
public class ProductsPage extends PageObject{
	
	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	private By bannerTitle =  By.cssSelector("#banner h1.title");
	
	private By allProductsButton = By.id("productsTabAll");
	private By backhaulProductsButton =  By.id("productsTabB");
	private By accessPointsProductsButton =  By.id("productsTabA");
	private By clientProductsButton =  By.id("productsTabC");
	
	private By backhaulProducts = By.id("productsB");


	/**
	 * Check if the Banner is visible
	 */
	public void isBannerTitleVisibile(){
		this.find(bannerTitle).shouldBeVisible();
	}

	/**
	 * Get Banner text
	 * @return String Banner text
	 */
	public String bannerTitleText(){
		return element(bannerTitle).getText();
	}
	
	/**
	 * Click All Button 
	 */
	public void clickAllButton(){
		element(allProductsButton).waitUntilVisible();
		element(allProductsButton).click();
	}

	/**
	 * Click Backhaul Button 
	 */
	public void clickBackhaulButton(){
		element(backhaulProductsButton).waitUntilVisible();
		element(backhaulProductsButton).click();
	}
	/**
	 * Click Access Points Button 
	 */
	public void clickAccassPointsButton(){
		element(accessPointsProductsButton).waitUntilVisible();
		element(accessPointsProductsButton).click();
	}
	/**
	 * Click ClientButton Button 
	 */
	public void clickClientButton(){
		element(clientProductsButton).waitUntilVisible();
		element(clientProductsButton).click();
	}
	
	public ProductGroup backhaulProducts(){
		return new ProductGroup(getDriver(),  element(backhaulProducts));
	}
	
	public class ProductGroup extends PageObject{
		private WebElementFacade rootElement;
		private By products = By.cssSelector("div.grayBorder > div.row > div");
		
		public ProductGroup(WebDriver driver, WebElementFacade rootElement){
			super(driver);
			this.rootElement = rootElement;
		}
		
		public Boolean isVisibile(){
			return rootElement.isVisible();
		}
		
		public List<Product> products(){
			List<Product> list = new ArrayList<Product>();
			List<WebElementFacade> elements = this.rootElement.thenFindAll(products);
			for (WebElementFacade element : elements){
				list.add(new Product(getDriver(), element));
			} 
			return list; 
		}
	}

	public class Product extends PageObject{
		private WebElementFacade rootElement;

		private By productImage = By.cssSelector("a > img");
		private By productName = By.cssSelector("a:nth-child(3)");
		
		public Product(WebDriver driver, WebElementFacade rootElement) {
			super(driver);
			this.rootElement = rootElement;
		}
				
		public void click(){		
			rootElement.find(productImage).waitUntilVisible();
			rootElement.find(productImage).click();
		}
		
		public String text(){
			rootElement.find(productName).waitUntilVisible();
			return rootElement.find(productName).getText();
		}
	}
}
