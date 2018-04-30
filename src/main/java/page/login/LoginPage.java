package page.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.BasePage;

public class LoginPage extends BasePage {

    @FindBy(name="login")
    private WebElement loginField;

    @FindBy(name = "passwd")
    private WebElement passwordField;

    @FindBy(className = "passport-Button")
    private WebElement submitLoginButton;

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
