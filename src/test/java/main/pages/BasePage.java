package main.pages;

import utils.XpathLocators;

import static com.codeborne.selenide.Condition.visible;

abstract class BasePage {

    public LoginPage exit() {
        XpathLocators.USER_TOOLBAR.shouldBe(visible.because("Нет элемента")).click();
        XpathLocators.LOG_OUT_BUTTON.shouldBe(visible.because("Нет элемента")).click();
        XpathLocators.CONFIRM_EXIT_BUTTON.shouldBe(visible.because("Нет элемента")).click();
        return new LoginPage();
    }
}
