package main.pages;

import utils.XpathLocators;

import static com.codeborne.selenide.Condition.visible;

public class SearchResultPage extends BasePage {

    public SearchResultPage() {
        check();
    }

    public void check() {
        XpathLocators.COUNT_OF_GROUPS.shouldBe(visible);
    }

    public int getCountOfGroups() {
        return Integer.parseInt(XpathLocators.COUNT_OF_GROUPS.getText());
    }
}
