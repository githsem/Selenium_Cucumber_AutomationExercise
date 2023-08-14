package com.myProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryProductPage extends BasePage {

    @FindBy(xpath = "//h2[.='Women - Dress Products']")
    public WebElement womenDressProductsText;

    @FindBy(xpath = "//a[@href='#Men']")
    public WebElement menCategory;

    @FindBy(xpath = "//a[.='Tshirts ']")
    public WebElement tshirtsCategory;

    @FindBy(xpath = "//h2[.='Men - Tshirts Products']")
    public WebElement menTshirtsProductsText;

}
