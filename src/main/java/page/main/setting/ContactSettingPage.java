package page.main.setting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.BasePage;

public class ContactSettingPage extends BasePage{
    //TODO

    public ContactSettingPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, ContactSettingPage.class);
    }
}
