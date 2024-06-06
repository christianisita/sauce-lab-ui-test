package com.example;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.example.core.DriverManager;
import com.example.core.GlobalVariable;
import com.example.objects.HomeObject;
import com.example.objects.LoginObject;
import com.example.pages.HomePage;
import com.example.pages.LoginPage;

public class PositiveTest extends DriverManager{

    LoginObject loginObject = new LoginObject();
    LoginPage loginPageAction = new LoginPage();
    HomeObject homeObject = new HomeObject();
    HomePage homePageAction = new HomePage();
    WebDriver driver = GlobalVariable.driver;

    @Test(priority = 1)
    public void canSeeLoginPageTest(){
        driver.get("https://www.saucedemo.com/");

        boolean inputUsernameVisible = Helper.isVisible(loginObject.getInputUsername());
        boolean inputPasswordVisible = Helper.isVisible(loginObject.getInputPassword());
        boolean loginButtonVisible = Helper.isVisible(loginObject.getButtonLogin());

        Assert.assertTrue(inputUsernameVisible);
        Assert.assertTrue(inputPasswordVisible);
        Assert.assertTrue(loginButtonVisible);
    }

    @Test(priority = 2)
    public void canLoginUsingCorrectCredentialTest(){
        loginPageAction.inputUsername("standard_user");
        loginPageAction.inputPassword("secret_sauce");
        loginPageAction.clickLoginButton();

        String currentUrl = driver.getCurrentUrl();
        boolean homeTitleVisible = Helper.isVisible(homeObject.getTextHomePageTitle());

        Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");
        Assert.assertTrue(homeTitleVisible);
    }

    @Test(priority = 3)
    public void canSeeProductCardTest(){
        boolean imageProductCardVisible = Helper.isVisible(homeObject.getImageProductCard());
        boolean textProductTitleVisible = Helper.isVisible(homeObject.getTextProductTitle());
        boolean textProductDescriptionVisible = Helper.isVisible(homeObject.getTextProductDescription());
        boolean textProductPriceVisible = Helper.isVisible(homeObject.getTextProductPrice());
        boolean buttonAtcGeneralVisible = Helper.isVisible(homeObject.getGeneralAtcButton());

        Assert.assertTrue(imageProductCardVisible);
        Assert.assertTrue(textProductTitleVisible);
        Assert.assertTrue(textProductDescriptionVisible);
        Assert.assertTrue(textProductPriceVisible);
        Assert.assertTrue(buttonAtcGeneralVisible);
    }

    @Test(priority = 4)
    public void canAddToCartTest(){
        homePageAction.addToCartSaucelabBagpack();

        boolean atcButtonSauceLabBagPackVisible = Helper.isVisible(homeObject.getAtcButtonSauceLabBagPack());
        boolean removeAtcButtonSauceLabBagPackVisible = Helper.isVisible(homeObject.getRemoveButtonSauceLabBagPack());
        boolean cartButtonVisible = Helper.isVisible(homeObject.getCartButton());
        boolean textCartBadgeVisible = Helper.isVisible(homeObject.getTextCartBadge());

        Assert.assertFalse(atcButtonSauceLabBagPackVisible);
        Assert.assertTrue(removeAtcButtonSauceLabBagPackVisible);
        Assert.assertTrue(cartButtonVisible);
        Assert.assertTrue(textCartBadgeVisible);
    }

    @Test(priority = 5)
    public void canRemoveProductTest(){
        homePageAction.removeAddToCartSauceLabBagpack();

        boolean atcButtonSauceLabBagPackVisible = Helper.isVisible(homeObject.getAtcButtonSauceLabBagPack());
        boolean removeAtcButtonSauceLabBagPackVisible = Helper.isVisible(homeObject.getRemoveButtonSauceLabBagPack());
        boolean cartButtonVisible = Helper.isVisible(homeObject.getCartButton());
        boolean textCartBadgeVisible = Helper.isVisible(homeObject.getTextCartBadge());

        Assert.assertTrue(atcButtonSauceLabBagPackVisible);
        Assert.assertFalse(removeAtcButtonSauceLabBagPackVisible);
        Assert.assertTrue(cartButtonVisible);
        Assert.assertFalse(textCartBadgeVisible);
    }

    

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
