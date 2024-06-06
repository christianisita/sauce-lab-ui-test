package com.example.pages;

import org.openqa.selenium.WebDriver;

import com.example.core.GlobalVariable;


public class BasePage {
    protected WebDriver driver;

    public BasePage(){
        this.driver = GlobalVariable.driver;
    }
}
