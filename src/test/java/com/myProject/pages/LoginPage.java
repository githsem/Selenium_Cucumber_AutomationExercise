package com.myProject.pages;

import com.myProject.utilities.ConfigurationReader;
import com.myProject.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginYourAccountText;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailBox;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPasswordBox;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),'Logged in')]")
    public WebElement usernameText;

    @FindBy(id = "dismiss-button")
    public WebElement dismissButton;

    @FindBy(xpath = "//p[contains(text(),'incorrect')]")
    public WebElement incorrectText;

    @FindBy(xpath = "//a[.=' Logout']")
    public WebElement logoutButton;


    public void loginInfo() {
        loginEmailBox.sendKeys(ConfigurationReader.get("email"));
        loginPasswordBox.sendKeys(ConfigurationReader.get("password"));
    }

    public void wrongLoginInfo() {
        loginEmailBox.sendKeys("wrongEmail@mail.com");
        loginPasswordBox.sendKeys("wrongPassword");
    }

    public void login() {
        loginButton.click();
    }


}
