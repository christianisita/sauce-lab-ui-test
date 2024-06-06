package com.example.pages;

import com.example.objects.CartObject;

public class CartPage extends BasePage{
    CartObject cartObject = new CartObject();

    public void clickCheckout(){
        cartObject.getCheckoutButton().click();
    }
}
