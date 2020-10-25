package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id="")
    private WebElement userNameElement;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }





}
