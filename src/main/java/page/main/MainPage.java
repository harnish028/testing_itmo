package page.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.BasePage;
import page.main.setting.ContactSettingPage;

public class MainPage extends BasePage {

    private WebDriver webDriver;

    @FindBy(className = "mail-ComposeButton")
    private WebElement writteMessageButton;

    @FindBy(css = "a[href*='#setup']")
    private WebElement settingButton;

    @FindBy(css = "a[href*='#setup/abook']")
    private WebElement settingContactsButton;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

    public ContactSettingPage navigateToContactSettingPage(){
        settingButton.click();
        settingContactsButton.click();

        return new ContactSettingPage(webDriver);
    }

    public NewMessagePage navigateToNewMessagePage() {
        writteMessageButton.click();

        return new NewMessagePage(webDriver);
    }
}
