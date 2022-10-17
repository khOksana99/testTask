package pages;

import helpers.Utils;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {
    /**
     * Open login page
     * @return this
     */
    public LoginPage openLoginPagePage() {
        open(Utils.PROPS.UI_URL_BASE());
        return new LoginPage();
    }
}
