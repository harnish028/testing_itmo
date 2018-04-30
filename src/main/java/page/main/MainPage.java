package page.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.BasePage;

public class MainPage extends BasePage {
    //TODO

    @FindBy
    private WebElement writteMessageButton;

    @FindBy(className = "mail-GhostButton")
    private WebElement settingButton;

    @FindBy()
    private WebElement settingContactsButton;


    public MainPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, MainPage.class);
    }


}
