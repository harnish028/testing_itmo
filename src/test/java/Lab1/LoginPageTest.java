package Lab1;

import helper.LoginPageHelper;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {

    private static WebDriver webDriver;
    private static LoginPageHelper loginPageHelper;

    @BeforeClass //TODO move to configuration class
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/university/third_course/6 семестр/Тестирование ПО/Labs/Lab1/chromedriver/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://passport.yandex.ru");
        loginPageHelper = new LoginPageHelper(webDriver);
    }

    @Test
    public void userLogin() {
        loginPageHelper.setValidValues();
    }
}
