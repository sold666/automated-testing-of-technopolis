package main.tests;

import main.pages.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

public class TestLogout extends BaseTest {

    @Test
    @Tag("Check utils")
    @DisplayName("Тест на правильность выхода из профиля")
    public void testLogout() {
        LoginPage resultLoginPage = new LoginPage()
                .login(System.getenv("LOGIN"), System.getenv("PASSWORD"))
                .exit();
        assertThat(resultLoginPage, instanceOf(LoginPage.class));
    }
}
