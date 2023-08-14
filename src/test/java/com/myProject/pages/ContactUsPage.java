package com.myProject.pages;

import com.myProject.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
    Actions actions = new Actions(Driver.get());

    @FindBy(xpath = "//h2[.='Get In Touch']")
    public WebElement getInTouchText;

    @FindBy(xpath = "//input[@data-qa='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@data-qa='submit-button']")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement chooseFileButton;

    @FindBy(xpath = "//div[contains(text(),'Success!')][1]")
    public WebElement successText;

    @FindBy(xpath = "//span[.=' Home']")
    public WebElement homeButton;

    @FindBy(id = "dismiss-button")
    public WebElement dismissButton;

    public void fillContactUsForm() {
        actions.click(nameBox)
                .sendKeys("myName" + Keys.TAB)
                .sendKeys("myEmail@email.com" + Keys.TAB)
                .sendKeys("mySubject" + Keys.TAB)
                .sendKeys("myMessage" + Keys.TAB)
                .perform();
    }

    public void uploadFile() {
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/test.txt";
        String fullPath = projectPath + "/" + filePath;
        chooseFileButton.sendKeys(fullPath);
    }


}
