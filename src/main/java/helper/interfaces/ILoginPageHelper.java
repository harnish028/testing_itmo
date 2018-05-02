package helper.interfaces;

import page.main.MainPage;

public interface ILoginPageHelper {

    MainPage tryToLogin(String login, String password);
    MainPage setValidValues();
}
