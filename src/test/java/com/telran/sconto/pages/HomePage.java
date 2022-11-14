package com.telran.sconto.pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.telran.sconto.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static String baseURL = PropertiesLoader.loadProperty("url");
    public static By acceptButton = By.cssSelector("[data-accept-action='all']");
    public static  By loginIcon = By.cssSelector(".headerElement__icon--login");

    public void acceptCookies() {
        $(acceptButton).click();
    }

    public void clickOnLoginIcon() {
        $(loginIcon).click();
    }

    private static By myAccountIconLocator = By.cssSelector(".headerElement__status--login");

    public SelenideElement myAccountIconDispalayed() {
        return $(myAccountIconLocator);
    }


    public void clickOnMyAccountIcon() {
        $(myAccountIconLocator).click();
    }
}
