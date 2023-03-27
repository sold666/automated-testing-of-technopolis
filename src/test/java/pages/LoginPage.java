package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement emailField = $("#field_email");
    private final SelenideElement passwordField = $("#field_password");
    private final SelenideElement loginButton = $("input[class='button-pro __wide']");
    private final SelenideElement loginForm = $("form[name='frmLogin']");
    private static final SelenideElement loginError = $("div[class='input-e login_error']");

    public MainPage login(String email, String password) {
        emailField.setValue(email);
        passwordField.setValue(password);
        loginButton.click();
        return new MainPage();
    }

    public SelenideElement getLoginForm() {
        return loginForm;
    }

    public SelenideElement getLoginButton() {
        return loginButton;
    }

    public SelenideElement getLoginError() {
        return loginError;
    }
}
