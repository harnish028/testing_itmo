package page.main.setting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.BasePage;

public class ContactSettingPage extends BasePage{

    private WebDriver webDriver;

    @FindBy(className = "js-setup-abook-create-group")
    private WebElement createNewGroupButton;

    @FindBy(css = "button[data-dialog-action=\"dialog.submit\"]")
    private WebElement createNewGroupButtonAfterInsertName;

    @FindBy(className = "nb-input")
    private WebElement newContactGroupNameField;

    public ContactSettingPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

    public ContactSettingPage clickCreateNewContactGroupButton() {
        createNewGroupButton.click();

        return this;
    }

    public ContactSettingPage insertNewContactGroupName(String groupName) {
        newContactGroupNameField.sendKeys(groupName);

        return this;
    }

    public ContactSettingPage clickCreateNewContactGroupButtonAfterInsertName() {
        createNewGroupButtonAfterInsertName.click();

        return this;
    }
}

