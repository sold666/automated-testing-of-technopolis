package main.tests;


import main.pages.LoginPage;
import main.pages.MainPage;
import main.pages.ProfilePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.Test;

public class TestCheckAvailabilityPhotos extends BaseTest {

    private static final String EXPECTED_STRING = "У вас ещё нет фотографий";

    @Test
    @DisplayName("Тест на проверку наличия фото в профиле")
    public void checkPhotos() {
        MainPage mainPage = new LoginPage().login(System.getenv("LOGIN"), System.getenv("PASSWORD"));
        ProfilePage profilePage = mainPage.goToProfile();
        Assertions.assertEquals(EXPECTED_STRING, profilePage.getPhotosContainer().getText());
        profilePage.exit();
    }
}
