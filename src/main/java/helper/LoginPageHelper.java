package helper;

import constants.ValidValues;
import helper.interfaces.ILoginPageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.login.LoginPage;
import page.main.MainPage;

public class LoginPageHelper implements ILoginPageHelper {

    private WebDriver webDriver;
    private LoginPage loginPage;

    public LoginPageHelper(WebDriver driver) {
        webDriver = driver;
        this.loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    public MainPage tryToLogin(String login, String password) {
        loginPage.clickEnterOnEmailButton()
                .insertLogin(login)
                .insertPassword(password)
                .clickSubmitButton();

        if (webDriver.getTitle().equals(ValidValues.WebDriverTitle.ERROR_AUTH_ON_LOGIN_PAGE)){

            return null;
        }

        return new MainPage(webDriver);
    }

    public MainPage setValidValues() {
        loginPage.clickEnterOnEmailButton()
                .insertLogin(ValidValues.LoginPageValue.LOGIN)
                .insertPassword(ValidValues.LoginPageValue.PASSWORD)
                .clickSubmitButton();

        return new MainPage(webDriver);
    }
}
