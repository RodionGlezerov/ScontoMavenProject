package com.telran.sconto.steps;

import com.telran.sconto.pages.CustomerAccountPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.page;

public class CustomerAccountPageSteps implements En {


    CustomerAccountPage customer;

    public CustomerAccountPageSteps(){
        Then("User Name is dispalyed", () ->{
            customer = page(CustomerAccountPage.class);
            customer.accountTitleDispalyed().should(exist);
        });
    }
}
