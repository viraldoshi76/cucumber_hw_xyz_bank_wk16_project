package com.bank.cucumber.stepDefs;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AddCustomertStepdefs {
    @Given("^I am on Login page$")
    public void iAmOnLoginPage() {
    }

    @When("^I click on Bank Manager Login Tab$")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginButton();
    }

    @And("^I click on Add customer tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustommerButton();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new AddCustomerPage().sendingTextToFirstNameField(firstName);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new AddCustomerPage().sendingTextToLastNameField(lastName);
    }

    @And("^I enter post code \"([^\"]*)\"$")
    public void iEnterPostCode(String postCode) throws InterruptedException {
        new AddCustomerPage().sendingTextToPostCodeField(postCode);
    }

    @And("^I click on Add customer Button$")
    public void iClickOnAddCustomerButton() throws InterruptedException {
        new AddCustomerPage().clickOnAddCustomerButton();
    }



    @Then("^I should get a message \"([^\"]*)\"$")
    public void iShouldGetAMessage(String addCustomerMessage) throws InterruptedException {
        Assert.assertTrue(new AddCustomerPage().gettingTextFromAlertMessage().contains(addCustomerMessage));
    }

    @And("^I click on alert message$")
    public void iClickOnAlertMessage() {
        new AddCustomerPage().clickOnAlertMessage();
    }
}
