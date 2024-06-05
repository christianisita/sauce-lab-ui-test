package com.example.objects;

import org.openqa.selenium.support.PageFactory;

import com.example.core.GlobalVariable;

public class BaseObject {
    public BaseObject(){
        PageFactory.initElements(GlobalVariable.driver, this);
    }
}
