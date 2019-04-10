package com.expleo.QE.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

@DefaultUrl("http://performance-testing.co.za/Main/login.html")
public class loginPageObject extends PageObject {

    private WebElement inputEmail;
    private WebElement inputPassword;
    private WebElement SigninButton;

    String baseUrl = "http://performance-testing.co.za/Main/login.html";
    String expectedTitle = "Cloud9 Airlines";

public void openTheBrowser() {
    open();
    getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
    //setImplicitTimeout(20, SECONDS);
}

    public void CaptureTheDetails() {
        System.out.println("In Capture The Details");

    }

    public void enterEmail(String email) {
        System.out.println("In enterEmail");
        inputEmail.clear();
        inputEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }

    public void clickSignInButton() {
        SigninButton.click();
    }
}
