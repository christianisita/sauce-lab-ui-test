package com.example.pages;

import com.example.objects.HomeObject;

public class HomePage extends BasePage{
    HomeObject homeObject = new HomeObject();

    public void addToCartSaucelabBagpack(){
        homeObject.getAtcButtonSauceLabBagPack().click();
    }

    public void removeAddToCartSauceLabBagpack(){
        homeObject.getRemoveButtonSauceLabBagPack().click();
    }

    public void goToCartPage(){
        homeObject.getCartButton().click();
    }
}
