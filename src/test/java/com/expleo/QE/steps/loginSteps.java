package com.expleo.QE.steps;

import com.expleo.QE.pages.loginPageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.support.PageFactory;

public class loginSteps {

    // TODO is this necessary?
    String dummy;

    public loginSteps() {
        this.dummy = "";
    }

    String baseUrl = "http://performance-testing.co.za/Main/login.html";
    String expectedTitle = "Cloud9 Airlines";

    loginPageObject page;  //= new loginPageObject();

    @Step("open the browser")
    public void openBrowser() {
        page.openTheBrowser();
    }

    @Step
    public void captureDetails() {
        page.enterEmail("wsi@netactive.co.za");
    }
}
