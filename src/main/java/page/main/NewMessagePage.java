package page.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.BasePage;

public class NewMessagePage extends BasePage{

    private WebDriver webDriver;

    @FindBy(className = "cke_contents_ltr")
    private WebElement messageContentField;

    @FindBy(className = "mail-Compose-Field_subject")
    private WebElement messageSubjectField;

    @FindBy(className = "mail-Bubbles")
    private WebElement addresseeField;

    @FindBy(id = "nb-16")
    private WebElement sendMessageButton;

    public NewMessagePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

    public NewMessagePage insertMessageAddressee(String addressee) {
        addresseeField.sendKeys(addressee);

        return this;
    }

    public NewMessagePage insertSubject(String subject) {
        messageSubjectField.sendKeys(subject);

        return this;
    }

    public NewMessagePage insertMessageContent(String content) {
        messageContentField.sendKeys(content);

        return this;
    }

    public NewMessagePage clickSendMessageButton() {
        sendMessageButton.click();

        return this;
    }
}
