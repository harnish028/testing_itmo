package helper;

import constanst.ValidValues;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.LoginPage;

public class LoginPageHelper {

    LoginPage loginPage;

    public LoginPageHelper(WebDriver driver) {
        this.loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    public void tryToLogin(String login, String password){
        loginPage.insertLogin(login).insertPassword(password);
        loginPage.clickSubmitButton();
    }

    public void setValidValues(){
        loginPage.insertLogin(ValidValues.LoginPageValue.LOGIN)
                 .insertPassword(ValidValues.LoginPageValue.PASSWORD);
        loginPage.clickSubmitButton();
    }
}
