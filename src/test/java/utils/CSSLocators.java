package utils;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CSSLocators {
    public static final SelenideElement EMAIL_FIELD = $("#field_email");
    public static final SelenideElement PASSWORD_FIELD = $("#field_password");
    public static final SelenideElement LOGIN_BUTTON = $("input[class='button-pro __wide']");
    public static final SelenideElement LOGIN_ERROR = $("div[class='input-e login_error']");
}
