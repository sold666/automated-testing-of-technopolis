package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class OkRuTest {

    @Test
    public void testLogin() {
        Configuration.browser = "edge";
        LoginPage loginPage = open("https://ok.ru/", LoginPage.class);

        MainPage mainPage = loginPage.login(System.getenv("PHONE"), System.getenv("PASSWORD"));

        mainPage.getProfileName().shouldHave(text("Владислав Корж"));
    }
}
