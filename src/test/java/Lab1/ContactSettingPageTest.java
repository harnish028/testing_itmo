package Lab1;

import helper.ContactSettingPageHelper;
import helper.LoginPageHelper;
import helper.interfaces.IContactSettingPageHelper;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.main.MainPage;

import java.util.concurrent.TimeUnit;

public class ContactSettingPageTest {

    static WebDriver webDriver;
    IContactSettingPageHelper contactSettingPageHelper = new ContactSettingPageHelper();

    @BeforeClass
    public static void initWebDriver(){
        System.setProperty("webdriver.chrome.driver", "/university/third_course/6 семестр/Тестирование ПО/Labs/Lab1/chromedriver/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://mail.yandex.ru/");
    }

    @Test
    public void createNewContactGroup(){
        LoginPageHelper loginPage = new LoginPageHelper(webDriver);
        MainPage mainPage = loginPage.setValidValues();
        mainPage.navigateToContactSettingPage();
    }
}
