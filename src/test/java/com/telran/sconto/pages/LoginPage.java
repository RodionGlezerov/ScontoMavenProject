package com.telran.sconto.pages;

import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.SelenideElement;
import com.telran.sconto.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static By loginTitleLocator = By.cssSelector(".existingAccount__headline");
    private static By emailInput = By.id("loginEmail");
    private static String validEmail = PropertiesLoader.loadProperty("valid.email");
    private static String validPassword = PropertiesLoader.loadProperty("valid.password");
    private static By passwordInput = By.id("loginPassword");
    private static By loginButtonLocator = By.id("login-submit");

    public SelenideElement loginPageTitleDisplayed() {
        return $(loginTitleLocator);
    }

    public void validLoginInput() {
        $(emailInput).setValue(validEmail);
        $(passwordInput).setValue(validPassword);
    }

    public void clickOnLoginButton() {
        $(loginButtonLocator).click();
    }

    public void wrongEmailInput(String email, String password) {
        $(emailInput).setValue(email);
        $(passwordInput).setValue(password);
    }

    public static By wrongEmailMessageLocator = By.id("loginEmail-error");

    public SelenideElement emailErrorDispalyed() {
        return $(wrongEmailMessageLocator);
    }
    public static By emptyEmailMessageLocator = By.id("loginEmail-error");
    public static By emptyPasswordMessageLocator = By.id("loginPassword-error");

    public static SelenideElement emailErrorMessageDisplayed() {
        return $(emptyEmailMessageLocator);
    }


    public static SelenideElement passwordErrorMessageDisplayed() {
        return $(emptyPasswordMessageLocator);
    }
}
