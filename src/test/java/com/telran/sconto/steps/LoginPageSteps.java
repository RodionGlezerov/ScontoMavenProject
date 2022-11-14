package com.telran.sconto.steps;

import com.telran.sconto.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageSteps implements En {

    LoginPage login;

    public LoginPageSteps(){
        Then("Login Page dispalyed",() -> {
           login = page(LoginPage.class);
           login.loginPageTitleDisplayed().should(exist);
           login.loginPageTitleDisplayed().shouldHave(text("Anmelden"));
        });

        When("Enter the valid credantials",() ->{
            login.validLoginInput();
        });

        And("Click on Anmelden button",() ->{
            login.clickOnLoginButton();
        });

        When("Enter the wrong email and a valid password",(DataTable table) ->{
            List<Map<String,String>> dataTable = table.asMaps();

            String email = dataTable.get(0).get("email");
            String password = dataTable.get(0).get("password");

            login.wrongEmailInput(email,password);
        });

        Then("Email Error message dispalyed",() -> {
            login.emailErrorDispalyed().shouldHave(text("Bitte geben Sie eine gültige E-Mail-Adresse ein"));
        });

        When("Enter valid password",(DataTable table) ->{
            List<Map<String,String>> dataTable = table.asMaps();

            String email = dataTable.get(0).get("email");
            String password = dataTable.get(0).get("password");

            login.wrongEmailInput(email,password);
        });

        Then("Email message displayed",() ->{
            login.emailErrorMessageDisplayed().shouldHave(text("Bitte geben Sie Ihre E-Mail-Adresse ein"));
        });

        When("Enter valid Email",(DataTable table) ->{
            List<Map<String,String>> dataTable = table.asMaps();

            String email = dataTable.get(0).get("email");
            String password = dataTable.get(0).get("password");

            login.wrongEmailInput(email,password);
        });

        Then("Password message displayed",() ->{
            login.passwordErrorMessageDisplayed().shouldHave(text("Bitte verwenden Sie ein Passwort"));
        });




    }
}
