package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    WebElement myElement;

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    public void findAndSendKeys(String strElement, String value) {
        switch (strElement) {
            case "username": myElement = username;break;
            case "password": myElement = password;break;
            case "nameInput": myElement = nameInput;break;
            case "codeInput": myElement = codeInput;break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "loginButton" : myElement = loginButton;break;
            case "saveButton" : myElement = saveButton;break;
            case "addButton": myElement = addButton;break;
        }
        clickFunction(myElement);
    }

    public void findAndVerify(String strElement,String text){
        switch (strElement)
        {
            case "dasboard" : myElement = dashboard;break;
            case "successMessage" : myElement = successMessage;break;
        }
        verifyContainsText(myElement,text);
    }

}
