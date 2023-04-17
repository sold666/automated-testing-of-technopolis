package main.pages;

import com.codeborne.selenide.SelenideElement;
import utils.CSSLocators;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static utils.TestConfig.LOGIN_PAGE_URL;

public class LoginPage {

    public LoginPage() {
        open(LOGIN_PAGE_URL);
        check();
    }

    public void check() {
        CSSLocators.EMAIL_FIELD.shouldBe(visible.because("Нет элемента"));
        CSSLocators.PASSWORD_FIELD.shouldBe(visible.because("Нет элемента"));
        CSSLocators.LOGIN_BUTTON.shouldBe(visible.because("Нет элемента"));
    }

    public MainPage login(String email, String password) {
        CSSLocators.EMAIL_FIELD.setValue(email);
        CSSLocators.PASSWORD_FIELD.setValue(password);
        CSSLocators.LOGIN_BUTTON.click();
        return new MainPage();
    }

    public SelenideElement loginInvalid(String email, String password) {
        CSSLocators.EMAIL_FIELD.setValue(email);
        CSSLocators.PASSWORD_FIELD.setValue(password);
        CSSLocators.LOGIN_BUTTON.click();
        return CSSLocators.LOGIN_ERROR.shouldBe(visible.because("Нет элемента"));
    }
}
