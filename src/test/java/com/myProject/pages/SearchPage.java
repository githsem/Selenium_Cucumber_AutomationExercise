package com.myProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {
    @FindBy(xpath = "//h2[.='Searched Products']")
    public WebElement searchedProductsText;

    @FindBy(xpath = "//div[@class='features_items']/div[@class=\"col-sm-4\"]")
    public List<WebElement> searchedProducts;


}
