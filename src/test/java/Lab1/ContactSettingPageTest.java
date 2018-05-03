package Lab1;

import helper.ContactSettingPageHelper;
import helper.LoginPageHelper;
import helper.interfaces.IContactSettingPageHelper;
import helper.interfaces.ILoginPageHelper;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.main.MainPage;
import page.main.setting.ContactSettingPage;

public class ContactSettingPageTest {

    static WebDriver webDriver;
    IContactSettingPageHelper contactSettingPageHelper;

    @BeforeClass
    public static void initWebDriver(){
        System.setProperty("webdriver.chrome.driver", "/university/third_course/6 семестр/Тестирование ПО/Labs/Lab1/chromedriver/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void createNewContactGroup(){
        ILoginPageHelper loginPage = new LoginPageHelper(webDriver);

        MainPage mainPage = loginPage.setValidValues();

        ContactSettingPage contactSettingPage = mainPage.navigateToContactSettingPage();

        contactSettingPageHelper = new ContactSettingPageHelper(contactSettingPage);
        contactSettingPageHelper.createValidNewContactGroup();

        webDriver.close();
    }
}
