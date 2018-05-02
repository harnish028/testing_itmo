package Lab1;

import helper.LoginPageHelper;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

    private static WebDriver webDriver;
    private static LoginPageHelper loginPageHelper;

    @BeforeClass //TODO move to configuration class
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/university/third_course/6 семестр/Тестирование ПО/Labs/Lab1/chromedriver/chromedriver.exe");
        webDriver = new ChromeDriver();
        loginPageHelper = new LoginPageHelper(webDriver);
    }

    @Test
    public void validUserLogin() {
        loginPageHelper.setValidValues();
    }

    @Test
    public void invalidUserLogin() {
        loginPageHelper.tryToLogin("inv", "inv");
    }

    @After
    public void finishTests() {
        webDriver.quit();
    }
}
