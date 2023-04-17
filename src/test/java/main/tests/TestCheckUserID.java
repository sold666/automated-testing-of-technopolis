package main.tests;

import main.pages.LoginPage;
import main.pages.MainPage;
import main.pages.SettingsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.Test;

public class TestCheckUserID extends BaseTest {

    private static final long ID = 597848543757L;

    @Test
    @DisplayName("Тест на проверку ID")
    public void checkID() {
        MainPage mainPage = new LoginPage().login(System.getenv("LOGIN"), System.getenv("PASSWORD"));
        SettingsPage settingsPage = mainPage.goToSettings();
        long userId = settingsPage.takeUserID();
        Assertions.assertEquals(ID, userId);
        settingsPage.exit();
    }
}
