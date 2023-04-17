package main.pages;

import utils.XpathLocators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Condition.text;

public class SettingsPage extends BasePage {

    public SettingsPage() {
    }

    public long takeUserID() {
        String id = XpathLocators.USER_SETTINGS_DATA
                .filter(text("597848543757"))
                .first().getText();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(id);
        if (matcher.find()) {
            id = matcher.group();
        }
        return Long.parseLong(id);
    }
}
