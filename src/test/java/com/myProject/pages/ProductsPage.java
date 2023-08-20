package com.myProject.pages;

import com.myProject.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//div[@class='features_items']//div[@class='col-sm-4']")
    public List<WebElement> productsList;

    @FindBy(xpath = "//a[.='View Product'][1]")
    public WebElement firstViewProductButton;

    @FindBy(xpath = "//h2[.='Blue Top']")
    public WebElement productName;

    @FindBy(xpath = "//p[.='Category: Women > Tops']")
    public WebElement productCategory;

    @FindBy(xpath = "//span[.='Rs. 500']")
    public WebElement productPrice;

    @FindBy(xpath = "//p[contains(text(),' In Stock')]")
    public WebElement productAvailability;

    @FindBy(xpath = "//p[contains(text(),' New')]")
    public WebElement productCondition;

    @FindBy(xpath = "//p[contains(text(),' Polo')]")
    public WebElement productBrand;

    @FindBy(id = "search_product")
    public WebElement searchProductBox;

    @FindBy(xpath = "//div[@class='overlay-content']//a[contains(@class,'add-to-cart')]")
    public List<WebElement> addToCartButtons;

    @FindBy(xpath = "//button[.='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//u[.='View Cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//h2[.='Brands']")
    public WebElement brandsText;

    public void clickBrandName(String brand) {
        Driver.get().findElement(By.xpath("//div[@class='brands-name']//a[contains(.,'" + brand + "')]")).click();
    }
}
