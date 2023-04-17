package main.pages;

import com.codeborne.selenide.SelenideElement;
import utils.XpathLocators;

import static com.codeborne.selenide.Condition.visible;

public class ProfilePage extends BasePage {

    public ProfilePage() {
        check();
    }

    public void check() {
        XpathLocators.PHOTOS_CONTAINER.shouldBe(visible.because("Нет элемента"));
    }

    public SelenideElement getPhotosContainer() {
        return XpathLocators.PHOTOS_CONTAINER;
    }
}
