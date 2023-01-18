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

    public void findAndSendKeys(String strElement, String value) {
        switch (strElement) {
            case "username": myElement = username;break;
            case "password": myElement = password;break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "loginButton" : myElement = loginButton;break;
        }
        clickFunction(myElement);
    }

    public void findAndVerify(String strElement,String text){
        switch (strElement)
        {
            case "dasboard" : myElement = dashboard;break;
        }
        verifyContainsText(myElement,text);
    }

}
