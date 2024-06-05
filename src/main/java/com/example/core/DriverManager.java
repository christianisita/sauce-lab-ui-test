package com.example.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
    public DriverManager(){
        WebDriverManager.chromedriver().setup();
        GlobalVariable.driver = new ChromeDriver();
        GlobalVariable.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
