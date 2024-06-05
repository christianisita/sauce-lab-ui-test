package com.example.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

@Getter
public class HomeObject extends BaseObject{
    @FindBy(xpath = "//*[@data-test='title']")
    private WebElement textHomePageTitle;

    @FindBy(xpath = "//*[@data-test='inventory-item']")
    private WebElement componentProductCard;

    @FindBy(xpath = "//*[@data-test='item-4-img-link']")
    private WebElement imageProductCard;

    @FindBy(xpath = "//*[@data-test='inventory-item-name']")
    private WebElement textProductTitle;

    @FindBy(xpath = "//*[@data-test='inventory-item-desc']")
    private WebElement textProductDescription;

    @FindBy(xpath = "//*[@data-test='inventory-item-price']")
    private WebElement textProductPrice;

    @FindBy(xpath = "//*[@data-test='add-to-cart-sauce-labs-backpack']")
    private WebElement atcButtonSauceLabBagPack;

    @FindBy(xpath = "//*[@data-test='remove-sauce-labs-backpack']")
    private WebElement removeButtonSauceLabBagPack;

    @FindBy(xpath = "//*[@class='btn btn_primary btn_small btn_inventory ']")
    private WebElement generalAtcButton;

    @FindBy(xpath = "//*[@data-test='shopping-cart-link']")
    private WebElement cartButton;

    @FindBy(xpath = "//*[@data-test='shopping-cart-badge']")
    private WebElement textCartBadge;
}
