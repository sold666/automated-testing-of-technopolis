package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement profileName = $x("//*[@id=\"hook_Block_Navigation\"]/div/div/div[1]/a");
    private final SelenideElement searchField = $x("//*[@id=\"toolbar_search\"]/toolbar-search/form/label/input");
    private final SelenideElement countOfGroups = $x("//*[@id=\"hook_Block_SearchMRB\"]/portal-search/div/div[1]/div[2]/div[2]/div[1]/div/div/span");
    public SelenideElement getProfileName() {
        return profileName;
    }

    public void search(String query) {
        searchField.setValue(query).pressEnter();
    }

    public int getSearchResultCount() {
        return Integer.parseInt(countOfGroups.getText());
    }

    public void logout() {
        SelenideElement menu = $x("//*[@id=\"hook_Block_ToolbarUserDropdown\"]/div");
        menu.click();
        SelenideElement logoutLink = $x("//*[@id=\"hook_Block_ToolbarUserDropdown\"]/div/div[2]/div/div[1]/div/div[1]/div[2]/a");
        SelenideElement buttonExit = $x("//*[@id=\"hook_FormButton_logoff.confirm_not_decorate\"]");
        if (logoutLink.exists()) {
            logoutLink.click();
            buttonExit.click();
        }
    }
}
