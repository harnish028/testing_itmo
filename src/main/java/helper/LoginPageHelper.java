package helper;

import constants.ValidValues;
import helper.interfaces.ILoginPageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.login.LoginPage;
import page.main.MainPage;

public class LoginPageHelper implements ILoginPageHelper{

    WebDriver webDriver;
    LoginPage loginPage;

    public LoginPageHelper(WebDriver driver) {
        webDriver = driver;
        this.loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    public MainPage tryToLogin(String login, String password){
        loginPage.insertLogin(login).insertPassword(password);
        loginPage.clickSubmitButton();

        return new MainPage(webDriver);
    }

    public MainPage setValidValues(){
        loginPage.insertLogin(ValidValues.LoginPageValue.LOGIN)
                 .insertPassword(ValidValues.LoginPageValue.PASSWORD);
        loginPage.clickSubmitButton();
//        return null;
        return new MainPage(webDriver);
    }
}
