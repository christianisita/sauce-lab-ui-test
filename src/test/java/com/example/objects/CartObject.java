package com.example.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

@Getter
public class CartObject extends BaseObject{
    @FindBy(xpath = "//*[@data-test='checkout']")
    private WebElement checkoutButton;
}
