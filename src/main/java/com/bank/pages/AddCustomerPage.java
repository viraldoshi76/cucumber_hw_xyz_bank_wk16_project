package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCodeField;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement addCustomerButton;


    public void sendingTextToFirstNameField(String value){
        sendTextToElement(firstNameField,value);
        log.info("Enter first name " + firstNameField.toString());
    }

    public void sendingTextToLastNameField(String value){
        sendTextToElement(lastNameField,value);
        log.info("Enter last name "+ lastNameField.toString());
    }

    public void sendingTextToPostCodeField(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(postCodeField,value);
        log.info("Enter Post Code " + postCodeField.toString());
    }

    public void clickOnAddCustomerButton() throws InterruptedException {
        Thread.sleep(3000);
        log.info("Clicking On Add Customer Button " + addCustomerButton.toString());
        clickOnElement(addCustomerButton);
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
        ///log.info("Accept on alert");
    }






}
