package com.example.pages;

import com.example.Helper;
import com.example.objects.CheckoutObject;

public class CheckoutPage extends BasePage{
    CheckoutObject checkoutObject = new CheckoutObject();

    public void inputFirstName(String firstName){
        Helper.clearText(checkoutObject.getInputFirstName());
        checkoutObject.getInputFirstName().sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        Helper.clearText(checkoutObject.getInputLastName());
        checkoutObject.getInputLastName().sendKeys(lastName);
    }

    public void inputPostalCode(String postalCode){
        Helper.clearText(checkoutObject.getInputPostalCode());
        checkoutObject.getInputPostalCode().sendKeys(postalCode);
    }

    public void clickContinueCheckout(){
        checkoutObject.getContinueCheckoutButton().click();
    }
}
