package com.example.pages;

import org.openqa.selenium.WebElement;

import com.example.objects.HomeObject;

public class HomePage extends BasePage{
    HomeObject homeObject = new HomeObject();

    public void addToCartSaucelabBagpack(){
        homeObject.getAtcButtonSauceLabBagPack().click();
    }

    public void removeAddToCartSauceLabBagpack(){
        homeObject.getRemoveButtonSauceLabBagPack().click();
    }
}
