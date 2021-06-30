package com.bank.cucumber.stepDefs;

import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.OpenAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class OpenAcccountStepdefs {
    @And("^I click on Open Account Tab$")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccountButton();
    }

    @And("^I select customer which was added before$")
    public void iSelectCustomerWhichWasAddedBefore() {
        new OpenAccountPage().selectOnDrowpDownList("6");
    }

    @And("^I select currency pound$")
    public void iSelectCurrencyPound() {
        new OpenAccountPage().selectCurrencyFromDropDownList("Pound");
    }

    @And("^I click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @Then("^I should get a created message \"([^\"]*)\"$")
    public void iShouldGetACreatedMessage(String accountCreatedMessage) throws InterruptedException {
        Assert.assertTrue(new OpenAccountPage().gettingTextFromAlertMessage().contains(accountCreatedMessage));
    }

    @And("^I click on created alert message$")
    public void iClickOnCreatedAlertMessage() {
        new OpenAccountPage().clickOnAlertMessage();
    }
}
