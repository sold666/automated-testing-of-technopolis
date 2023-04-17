package main.tests;

import main.pages.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class TestCheckCountOfGroups extends BaseTest {

    private static final String SEARCH_REQUEST = "VK";

    @Test
    @DisplayName("Тест на проверку числа найденных групп")
    public void testSearch() {
        assertThat(new LoginPage()
                .login(System.getenv("LOGIN"), System.getenv("PASSWORD"))
                .search(SEARCH_REQUEST)
                .getCountOfGroups(), greaterThan(0));
    }
}
