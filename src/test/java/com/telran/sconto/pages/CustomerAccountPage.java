package com.telran.sconto.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CustomerAccountPage {

    private static By accountTitleLocator = By.cssSelector(".titleHeadline");
    public SelenideElement accountTitleDispalyed() {
        return $(accountTitleLocator);
    }
}
