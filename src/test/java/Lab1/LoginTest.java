package Lab1;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    private static WebDriver webDriver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/university/third_course/6 семестр/Тестирование ПО/Labs/Lab1/chromedriver/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://passport.yandex.ru");
    }

    @Test
    public void userLogin() {
        WebElement loginField = webDriver.findElement(By.id("login"));
        loginField.sendKeys("testparshikov2");
        WebElement passwordField = webDriver.findElement(By.id("password"));
        passwordField.sendKeys("testparshikov2");
        WebElement loginButton = webDriver.findElement(By.xpath("//button[text()='Войти']"));
        loginButton.click();
    }
}
