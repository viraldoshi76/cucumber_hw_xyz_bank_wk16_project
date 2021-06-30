package com.bank.cucumber.stepDefs;

import com.bank.pages.AccountPage;
import com.bank.pages.CustomersPage;
import com.bank.pages.HomePage;
import com.bank.pages.OpenAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginLogoutStepdefs {
    @And("^I click on home button$")
    public void iClickOnHomeButton() {
        new OpenAccountPage().clickOnHomeButton();
    }

    @And("^I click customer login tab$")
    public void iClickCustomerLoginTab() {
        new HomePage().clickOnCustomerLoginButton();
    }

    @And("^I select customer from list$")
    public void iSelectCustomerFromList() {
        new CustomersPage().selectCustomerFromDropDownList("6");
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new CustomersPage().clickOnLoginButton();
    }

    @And("^I have logged in successfully \"([^\"]*)\"$")
    public void iHaveLoggedInSuccessfully(String logoutText) {
        Assert.assertTrue(new AccountPage().gettingTextOnLogoutButton().contains(logoutText));

    }


    @And("^I click on Log out button$")
    public void iClickOnLogOutButton() {
        new AccountPage().clickOnLogoutButton();
    }

    @Then("^I should see name message displayed \"([^\"]*)\"$")
    public void iShouldSeeNameMessageDisplayed(String nameMessage) throws InterruptedException {
        Assert.assertTrue(new AccountPage().getNameMessageDisplayed().contains(nameMessage));

    }


}
