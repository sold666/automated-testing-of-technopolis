package main.tests;

import main.pages.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class TestInvalidLogin extends BaseTest {

    private static final String EXPECTED_ERROR_MESSAGE = "Неправильно указан логин и/или пароль";

    @Test
    @Tag("Check utils")
    @DisplayName("Тест на ввод невалидных данных при входе в профиль")
    @Disabled("Текущий тест отключен для демонстрации")
    public void testInvalidLogin() {
        Assertions.assertEquals(EXPECTED_ERROR_MESSAGE, new LoginPage()
                .loginInvalid("invalid_login", "invalid_password")
                .getText());
    }
}
