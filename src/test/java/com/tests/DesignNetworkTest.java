package com.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.requirements.Mimosa;
import com.steps.CloudSteps;
import com.steps.HeaderSteps;
import com.steps.LogInPageSteps;

@RunWith(ThucydidesRunner.class)
@Story(Mimosa.Cloud.Design.class)

public class DesignNetworkTest {

	@Managed(uniqueSession = false)
    public WebDriver webdriver;
	
	@ManagedPages(defaultUrl = "http://mimosa.co/")
    public Pages pages;

    @Steps
    public LogInPageSteps loginPageSteps;

    @Steps
    public HeaderSteps headerSteps;

    @Steps
    public CloudSteps cloudSteps;
    
    @Test
    public void DesignNetwork(){

    	headerSteps.clickLoginButton();
    	loginPageSteps.loginWithCredentials("darkhacker3745@yahoo.com", "aaaaaaaa1");
    	headerSteps.checkUserIsLoggedIn();
    	cloudSteps.clickDesign();
    	cloudSteps.closePopup();
    	cloudSteps.searchLocation("Cluj Napoca Romania");
    	cloudSteps.selectSecondPosition();

    	Assert.assertEquals("0%", cloudSteps.obstructionsText());
    	Assert.assertTrue("Chart was not displayed", cloudSteps.isChartVisible());
    	
    }
}
