package com.bank.cucumber.stepDefs;

import com.bank.pages.AccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class DepositStepdefs {
    @And("^I click on Deposit button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositButton();
    }

    @And("^I enter amount \"([^\"]*)\"$")
    public void iEnterAmount(String depositAmount)  {
        new AccountPage().enterTheAmountOnDepositField(depositAmount);
    }

    @And("^I click on deposit button after amount entered$")
    public void iClickOnDepositButtonAfterAmountEntered() {
        new AccountPage().clickOnDepositButtonAfterAmountSelected();
    }

    @Then("^I should deposit amount successfully \"([^\"]*)\"$")
    public void iShouldDepositAmountSuccessfully(String depositMessage)  {
        Assert.assertTrue(new AccountPage().gettingTextFromConfirmMessage().contains(depositMessage));
    }
}
