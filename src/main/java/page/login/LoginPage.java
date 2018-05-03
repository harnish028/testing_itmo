package page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.BasePage;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    @FindBy(name="login")
    private WebElement loginField;

    @FindBy(name = "passwd")
    private WebElement passwordField;

    @FindBy(className = "passport-Button")
    private WebElement submitLoginButton;

    @FindBy(className = "HeadBanner-Button-Enter")
    private WebElement enterOnMailButton;

    public LoginPage(WebDriver webDriver) {
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://mail.yandex.ru/");

        PageFactory.initElements(webDriver, PageFactory.class);
    }

    public LoginPage clickEnterOnEmailButton() {
        enterOnMailButton.click();

        return this;
    }

    public LoginPage insertLogin(String loginValue) {
        loginField.sendKeys(loginValue);

        return this;
    }

    public LoginPage insertPassword(String passwordValue) {
        passwordField.sendKeys(passwordValue);

        return this;
    }

    public LoginPage clickSubmitButton() {
        submitLoginButton.click();

        return this;
    }
}
