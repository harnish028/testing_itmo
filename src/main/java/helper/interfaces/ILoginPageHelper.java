package helper.interfaces;

import page.login.LoginPage;

public interface ILoginPageHelper {

    LoginPage tryToLogin(String login, String password);
    void setValidValues();
}
