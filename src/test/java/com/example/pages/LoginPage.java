package com.example.pages;

import com.example.Helper;
import com.example.objects.LoginObject;

public class LoginPage extends BasePage{
    LoginObject loginObject = new LoginObject();

    public void clickLoginButton(){
        loginObject.getButtonLogin().click();
    }

    public void inputUsername(String username){
        Helper.clearText(loginObject.getInputUsername());
        loginObject.getInputUsername().sendKeys(username);
    }

    public void inputPassword(String password){
        Helper.clearText(loginObject.getInputPassword());
        loginObject.getInputPassword().sendKeys(password);
    }
}
