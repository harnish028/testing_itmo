package Lab1;

import helper.LoginPageHelper;
import helper.NewMessagePageHelper;
import helper.interfaces.ILoginPageHelper;
import helper.interfaces.INewMessagePageHelper;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.main.MainPage;
import page.main.NewMessagePage;

public class NewMessagePageTest {

    private static WebDriver webDriver;
    private INewMessagePageHelper newMessagePageHelper;

    @BeforeClass
    public static void initWebDriver(){
        System.setProperty("webdriver.chrome.driver", "/university/third_course/6 семестр/Тестирование ПО/Labs/Lab1/chromedriver/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void sendValidMessage(){
        ILoginPageHelper loginPage = new LoginPageHelper(webDriver);

        MainPage mainPage = loginPage.setValidValues();

        NewMessagePage newMessagePage= mainPage.navigateToNewMessagePage();

        newMessagePageHelper = new NewMessagePageHelper(newMessagePage);
        newMessagePageHelper.sendValidMessage();
    }
}
