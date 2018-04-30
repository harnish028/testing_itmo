package helper;

import constanst.ValidValues;
import helper.interfaces.ILoginPageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.login.LoginPage;

public class LoginPageHelper implements ILoginPageHelper{

    LoginPage loginPage;

    public LoginPageHelper(WebDriver driver) {
        this.loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    public LoginPage tryToLogin(String login, String password){
        loginPage.insertLogin(login).insertPassword(password);
        loginPage.clickSubmitButton();

        return loginPage;
    }

    public void setValidValues(){
        loginPage.insertLogin(ValidValues.LoginPageValue.LOGIN)
                 .insertPassword(ValidValues.LoginPageValue.PASSWORD);
        loginPage.clickSubmitButton();
        loginPage.waitOneSecond();
    }
}
