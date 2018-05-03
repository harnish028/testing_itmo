package Lab1;

import helper.LoginPageHelper;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.main.MainPage;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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
        MainPage mainPage = loginPageHelper.setValidValues();

        assertNotNull("Login is valid", mainPage);
        webDriver.close();
    }

    @Test
    public void invalidUserLogin() {
        MainPage mainPage = loginPageHelper.tryToLogin("inv", "inv");

        assertNull("Invalid login", mainPage);
        webDriver.close();
    }
}
