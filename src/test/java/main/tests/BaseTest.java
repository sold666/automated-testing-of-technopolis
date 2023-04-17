package main.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static utils.TestConfig.BROWSER;
import static utils.TestConfig.SCREEN_EXTENSION;

abstract public class BaseTest {

    @BeforeEach
    public void init() {
        setUp();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }

    private void setUp() {
        Configuration.browser = BROWSER;
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = SCREEN_EXTENSION;
    }
}
