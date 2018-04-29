package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(name="login")
    private WebElement loginField;

    @FindBy(name = "passwd")
    private WebElement passwordField;

//    @FindBy(css = "input[type=\"submit\"]")
    @FindBy(className = "passport-Button")
    private WebElement submitLoginButton;

    public LoginPage(){
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
