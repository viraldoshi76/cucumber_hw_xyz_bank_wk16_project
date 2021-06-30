package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerDropDownSelection;

    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropDownList;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement clickOnProcessButton;

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement clickOnHomeButton;

    public void selectOnDrowpDownList(String value){
        selectByValueFromDropDown(customerDropDownSelection,value);
        log.info("Select customer "+ value + "from drop down list "+ customerDropDownSelection.toString());
    }

    public void selectCurrencyFromDropDownList(String value){
        selectByValueFromDropDown(currencyDropDownList,value);
        log.info("select currency "+ value + "from drop down list" +currencyDropDownList.toString());
    }

    public void clickOnProcessButton(){
        log.info("click on process button" + clickOnProcessButton.toString());
        clickOnElement(clickOnProcessButton);
    }

    public String gettingTextFromAlertMessage() throws InterruptedException {
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        log.info("Getting text from Alert ");
        return alert.getText();
    }

    public void clickOnAlertMessage() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        log.info("Accept on alert");
    }

    public void clickOnHomeButton(){
        clickOnElement(clickOnHomeButton);
        log.info("clicking on home button"+ clickOnHomeButton.toString());
    }

}
