package com.example;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.example.core.DriverManager;
import com.example.core.GlobalVariable;
import com.example.objects.CheckoutObject;
import com.example.objects.HomeObject;
import com.example.objects.LoginObject;
import com.example.pages.CartPage;
import com.example.pages.CheckoutPage;
import com.example.pages.HomePage;
import com.example.pages.LoginPage;

public class NegativeTest extends DriverManager{
    LoginObject loginObject = new LoginObject();
    LoginPage loginPageAction = new LoginPage();
    HomeObject homeObject = new HomeObject();
    HomePage homePageAction = new HomePage();
    CartPage cartPageAction = new CartPage();
    CheckoutObject checkoutObject = new CheckoutObject();
    CheckoutPage checkoutPageAction = new CheckoutPage();

    WebDriver driver = GlobalVariable.driver;

    @Test(priority = 1)
    public void bypassCartWithoutLoginTest(){
        driver.get("https://www.saucedemo.com/cart.html");
        String errorText = loginObject.getErrorText().getText();
        Assert.assertEquals(errorText, "Epic sadface: You can only access '/cart.html' when you are logged in.");
    }

    @Test(priority = 2)
    public void inputEmptyUsernameTest(){
        loginPageAction.inputUsername("");
        loginPageAction.inputPassword("password");
        loginPageAction.clickLoginButton();

        String errorText = loginObject.getErrorText().getText();
        Assert.assertEquals(errorText, "Epic sadface: Username is required");
    }

    @Test(priority = 3)
    public void inputEmptyPasswordTest(){
        loginPageAction.inputUsername("standard_user");
        loginPageAction.inputPassword("");
        loginPageAction.clickLoginButton();

        String errorText = loginObject.getErrorText().getText();
        Assert.assertEquals(errorText, "Epic sadface: Password is required");

    }

    @Test(priority = 4)
    public void inputWrongPasswordTest(){
        loginPageAction.inputUsername("standard_user");
        loginPageAction.inputPassword("password");
        loginPageAction.clickLoginButton();

        String errorText = loginObject.getErrorText().getText();
        Assert.assertEquals(errorText, "Epic sadface: Username and password do not match any user in this service");
    }

    @Test(priority = 5)
    public void emptyFirstNameOnCheckoutTest(){
        loginPageAction.inputUsername("standard_user");
        loginPageAction.inputPassword("secret_sauce");
        loginPageAction.clickLoginButton();
        homePageAction.addToCartSaucelabBagpack();
        homePageAction.goToCartPage();
        cartPageAction.clickCheckout();
        checkoutPageAction.inputFirstName("");
        checkoutPageAction.inputLastName("last");
        checkoutPageAction.inputPostalCode("124");
        checkoutPageAction.clickContinueCheckout();

        String errorText = checkoutObject.getErrorText().getText();

        Assert.assertEquals(errorText, "Error: First Name is required");
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
