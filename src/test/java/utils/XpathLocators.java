package utils;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class XpathLocators {
    public static final SelenideElement PROFILE_NAME = $x("//div[@class='tico ellip']");
    public static final SelenideElement SEARCH_FIELD = $x("//input[@name='st.query']");
    public static final SelenideElement COUNT_OF_GROUPS = $x("//span[@class='title-count__esm8s']");
    public static final SelenideElement USER_TOOLBAR = $x("//div[@data-module='Toolbar']");
    public static final SelenideElement LOG_OUT_BUTTON = $x("//a[@data-l='t,logout']");
    public static final SelenideElement CONFIRM_EXIT_BUTTON = $x("//input[@data-l='t,logout']");
    public static final SelenideElement PHOTOS_CONTAINER = $x("//div[@class='group-main-portlet_stub']");
    public static final ElementsCollection USER_TOOLBAR_ELEMENTS = $$x("//span[@class='u-menu_tx ellip-i lp']");
    public static final ElementsCollection USER_SETTINGS_DATA = $$x("//div[@class='user-settings_i_tx']");
}
