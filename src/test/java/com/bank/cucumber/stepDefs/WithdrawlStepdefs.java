package com.bank.cucumber.stepDefs;

import com.bank.pages.AccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class WithdrawlStepdefs {
    @And("^I click on Withdrawl tab$")
    public void iClickOnWithdrawlTab() {
        new AccountPage().clickingOnWithdrawlButton();
    }

    @And("^I enter withdrawl amount \"([^\"]*)\"$")
    public void iEnterWithdrawlAmount(String withdrawAmount) throws InterruptedException {
        new AccountPage().enterWithdrawlAmount(withdrawAmount);

    }

    @And("^I click on withdraw button$")
    public void iClickOnWithdrawButton() {
        new AccountPage().clickWithdrawButtonAfterAmountEntered();
    }

    @Then("^I should withdraw money successfully with message \"([^\"]*)\"$")
    public void iShouldWithdrawMoneySuccessfullyWithMessage(String withdrawlMessage) throws InterruptedException {
        Assert.assertTrue(new AccountPage().gettingTextFromWithdrawlConfirmation().contains(withdrawlMessage));
    }
}
