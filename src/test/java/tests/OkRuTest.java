package tests;

import com.codeborne.selenide.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.LoginPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.openqa.selenium.devtools.v110.page.Page.close;

//@Disabled("This tests is currently under development")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OkRuTest {

    private static LoginPage loginPage;
    private static MainPage mainPage;

    @BeforeClass
    public static void setUp() {
        Configuration.browser = "edge";
        loginPage = open("https://ok.ru/", LoginPage.class);
    }

    @AfterClass
    public static void tearDown() {
        close();
    }

    @Test
    public void testInvalidLogin() {
        loginPage.login("invalid_login", "invalid_password");
        loginPage.getLoginError().should(text("Неправильно указан логин и/или пароль"));
    }

    @Test
    public void testLogin() {
        mainPage = loginPage.login(System.getenv("LOGIN"), System.getenv("PASSWORD"));
        mainPage.getProfileName().shouldHave(text("botS23AT12"));
    }

    @Test
    public void testLogout() {
        mainPage.logout();
        loginPage.getLoginButton().getAttribute(String.valueOf(value("Войти в Одноклассники")));
    }

    @Test
    public void testSearch() {
        mainPage = loginPage.login(System.getenv("LOGIN"), System.getenv("PASSWORD"));
        mainPage.search("VK");
        assertThat(mainPage.getSearchResultCount(), greaterThan(0));
    }
}
