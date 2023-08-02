package com.myProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginYourAccountText;
}
