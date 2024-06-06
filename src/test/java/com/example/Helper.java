package com.example;

import org.openqa.selenium.Keys;
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

    public static void clearText(WebElement element){
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")){
            element.sendKeys(new CharSequence[]{Keys.COMMAND + "a"});
            element.sendKeys(new CharSequence[]{Keys.DELETE});
        } else {
            element.sendKeys(new CharSequence[]{Keys.CONTROL + "a"});
            element.sendKeys(new CharSequence[]{Keys.DELETE});
        }
    }
}
