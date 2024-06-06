package com.example.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

@Getter
public class LoginObject extends BaseObject{
    @FindBy(xpath = "//*[@data-test='username']")
    private WebElement inputUsername;

    @FindBy(xpath = "//*[@data-test='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//*[@data-test='login-button']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//*[@data-test='error']")
    private WebElement errorText;
}
