package com.example.pages;

import org.openqa.selenium.WebElement;

import com.example.objects.LoginObject;

public class LoginPage extends BasePage{
    LoginObject loginObject = new LoginObject();

    public void clickLoginButton(){
        loginObject.getButtonLogin().click();
    }

    public void inputUsername(String username){
        loginObject.getInputUsername().sendKeys(username);
    }

    public void inputPassword(String password){
        loginObject.getInputPassword().sendKeys(password);
    }
}
