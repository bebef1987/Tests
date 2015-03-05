package com.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.requirements.Mimosa;
import com.steps.HeaderSteps;
import com.steps.LogInPageSteps;

@RunWith(ThucydidesRunner.class)
@Story(Mimosa.Login.LoginValid.class)
public class TestLogin {
	
	@Managed(uniqueSession = false)
    public WebDriver webdriver;

    @Steps
    public LogInPageSteps loginPageSteps;

    @Steps
    public HeaderSteps headerSteps;
    
    @Test
    public void performLogin(){
    	headerSteps.clickLoginButton();
    	loginPageSteps.loginWithCredentials("darkhacker3745@yahoo.com", "aaaaaaaa1");
    	headerSteps.checkUserIsLoggedIn();
    }

}
