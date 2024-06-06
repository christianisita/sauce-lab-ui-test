package com.example.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

@Getter
public class CheckoutObject extends BaseObject {

    @FindBy(xpath = "//*[@data-test='firstName']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//*[@data-test='lastName']")
    private WebElement inputLastName;

    @FindBy(xpath = "//*[@data-test='postalCode']")
    private WebElement inputPostalCode;

    @FindBy(xpath = "//*[@data-test='continue']")
    private WebElement continueCheckoutButton;

    @FindBy(xpath = "//*[@data-test='error']")
    private WebElement errorText;
}
