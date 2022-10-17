package facade;

import com.codeborne.selenide.Condition;
import pages.LoginPage;
import pages.elements.LoginPageElements;

import static com.codeborne.selenide.Selenide.$;


public class LoginFacade extends BaseFacade<LoginFacade> implements LoginPageElements {
    private LoginPage loginPage = new LoginPage();

    public LoginFacade staticCheckOfLoginPage() {
        loginPage.verifyLoginTitle();
        loginPage.verifyUsername();
        loginPage.verifyPassword();
        return this;
    }

    public LoginFacade login(String username, String password) {
        loginPage.typeUsername(username);
        loginPage.typePassword(password);
        loginPage.clickOnSubmitBtn();
        return this;
    }

    public LoginFacade verifyAccountNotCreated() {
        $(errorMsg).shouldBe(Condition.visible);
        loginPage.verifyErrorMessageForNoAccount();
        return this;
    }
}
