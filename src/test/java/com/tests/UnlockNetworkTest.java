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
import com.steps.UnlockSteps;

@RunWith(ThucydidesRunner.class)
@Story(Mimosa.Cloud.Unlock.class)
public class UnlockNetworkTest {

	@Managed(uniqueSession = false)
    public WebDriver webdriver;
	
	@ManagedPages(defaultUrl = "http://mimosa.co/")
    public Pages pages;

    @Steps
    public LogInPageSteps loginPageSteps;

    @Steps
    public HeaderSteps headerSteps;

    @Steps
    public UnlockSteps unlockSteps;
    
    @Steps
    public CloudSteps cloudSteps;
    
    @Test
    public void UnlockNetwork(){
 
    	headerSteps.clickLoginButton();
    	loginPageSteps.loginWithCredentials("darkhacker3745@yahoo.com", "aaaaaaaa1");
    	headerSteps.checkUserIsLoggedIn();
    	cloudSteps.clickUnlock();
    	unlockSteps.enterSerialNumber("1234567890");
    	unlockSteps.clickCheckbox();
    	unlockSteps.clickSubmit();
    	//TODO Asserts to be added
    }
}
