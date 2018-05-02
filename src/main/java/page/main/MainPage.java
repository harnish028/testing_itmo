package page.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.BasePage;

public class MainPage extends BasePage {
    //TODO

    @FindBy(className = "mail-ComposeButton")
    private WebElement writteMessageButton;

    @FindBy(className = "js-left-col-toolbar-compose")
    private WebElement settingButton;

    @FindBy(css = "a[href*='#setup/abook']")
    private WebElement settingContactsButton;

    private WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
//        PageFactory.initElements(this.webDriver,  this);
        PageFactory.initElements(this.webDriver, this);
    }

    public void navigateToContactSettingPage(){
        settingButton.click();
        settingContactsButton.click();
    }

    public NewMessagePage navigateToNewMessagePage() {
        writteMessageButton.click();

        return new NewMessagePage(webDriver);
    }
}
