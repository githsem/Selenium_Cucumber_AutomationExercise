package com.myProject.pages;

import com.myProject.utilities.ConfigurationReader;
import com.myProject.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {

    Actions actions = new Actions(Driver.get());

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignupText;

    @FindBy(name = "name")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//button[.='Signup']")
    public WebElement signupButton;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccountText;

    @FindBy(id = "uniform-id_gender1")
    public WebElement genderButton;

    @FindBy(id = "days")
    public WebElement selectDay;

    @FindBy(id = "months")
    public WebElement selectMonth;

    @FindBy(id = "years")
    public WebElement selectYear;

    @FindBy(id = "newsletter")
    public WebElement newsletterBox;

    @FindBy(id = "country")
    public WebElement selectCountry;

    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(id = "dismiss-button")
    public WebElement dismissButton;

    @FindBy(xpath = "//a[contains(text(),'Logged in')]")
    public WebElement loggedInText;

    @FindBy(xpath = "//a[.=' Delete Account']")
    public WebElement deleteAccountButton;

    @FindBy(css = ".title.text-center")
    public WebElement accountDeletedText;

    @FindBy(xpath = "//p[.='Email Address already exist!']")
    public WebElement alreadyExistText;


    public void fillForm() {

        Select select1 = new Select(selectDay);
        select1.selectByVisibleText("1");
        Select select2 = new Select(selectMonth);
        select2.selectByVisibleText("January");
        Select select3 = new Select(selectYear);
        select3.selectByVisibleText("1981");
        Select select4 = new Select(selectCountry);
        select4.selectByVisibleText("Canada");

        actions.click(genderButton).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(ConfigurationReader.get("password") + Keys.TAB + Keys.TAB + Keys.TAB + Keys.TAB).click(newsletterBox).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(ConfigurationReader.get("firstName") + Keys.TAB).sendKeys(ConfigurationReader.get("lastName") + Keys.TAB + Keys.TAB).sendKeys(ConfigurationReader.get("address") + Keys.TAB + Keys.TAB + Keys.TAB).sendKeys(ConfigurationReader.get("state") + Keys.TAB).sendKeys(ConfigurationReader.get("city") + Keys.TAB).sendKeys(ConfigurationReader.get("zipcode") + Keys.TAB).sendKeys(ConfigurationReader.get("mobilNumber") + Keys.ENTER).perform();
    }
}
