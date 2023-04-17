package main.tests;

import main.pages.LoginPage;
import main.pages.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.Test;

public class TestLogin extends BaseTest {

    private static final String PROFILE_NAME = "botS23AT12 botS23AT12";

    @Test
    @Tag("Check utils")
    @DisplayName("Тест на правильность входа в профиль")
    public void testLogin() {
        MainPage mainPage = new LoginPage().login(System.getenv("LOGIN"), System.getenv("PASSWORD"));
        Assertions.assertEquals(PROFILE_NAME, mainPage
                .getProfileName()
                .getText());
        mainPage.exit();
    }
}
