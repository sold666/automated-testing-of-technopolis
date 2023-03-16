package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement profileName = $x("//*[@id=\"hook_Block_Navigation\"]/div/div/div[1]/a");

    public SelenideElement getProfileName() {
        return profileName;
    }
}
