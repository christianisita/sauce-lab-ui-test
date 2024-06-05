package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.core.GlobalVariable;

public class Helper {
    WebDriver driver = GlobalVariable.driver;

    public static boolean isVisible(WebElement element){
        try {
            element.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
