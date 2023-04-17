package main;

import main.tests.*;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestLogin.class,
        TestInvalidLogin.class,
        TestLogout.class,
        TestCheckAvailabilityPhotos.class,
        TestCheckUserID.class,
        TestCheckCountOfGroups.class
})
@IncludeTags("Check utils")
@SuiteDisplayName("Тесты для ok.ru")
public class TestSuite {
}
