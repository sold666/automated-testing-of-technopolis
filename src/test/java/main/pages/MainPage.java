package main.pages;

import com.codeborne.selenide.SelenideElement;
import utils.XpathLocators;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class MainPage extends BasePage {

    public MainPage() {
        check();
    }

    public void check() {
        XpathLocators.PROFILE_NAME.shouldBe(visible.because("Нет элемента"));
        XpathLocators.SEARCH_FIELD.shouldBe(visible.because("Нет элемента"));
    }

    public SearchResultPage search(String query) {
        XpathLocators.SEARCH_FIELD.setValue(query).pressEnter();
        return new SearchResultPage();
    }

    public ProfilePage goToProfile() {
        XpathLocators.PROFILE_NAME.click();
        return new ProfilePage();
    }

    public SettingsPage goToSettings() {
        XpathLocators.USER_TOOLBAR.shouldBe(visible.because("Нет элемента")).click();
        XpathLocators.USER_TOOLBAR_ELEMENTS
                .filter(text("Изменить настройки"))
                .first()
                .click();
        return new SettingsPage();
    }

    public SelenideElement getProfileName() {
        return XpathLocators.PROFILE_NAME;
    }
}
