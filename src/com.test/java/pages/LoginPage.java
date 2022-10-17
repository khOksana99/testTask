package pages;

import io.qameta.allure.Step;
import pages.elements.LoginPageElements;

import static com.codeborne.selenide.Selenide.$;
import static constant.AssertionMessages.*;
import static constant.ErrorMessages.incorrectUser;
import static constant.PageConstants.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginPage extends BasePage implements LoginPageElements {
    @Step("Verify login title is displayed and correct")
    public LoginPage verifyLoginTitle() {
        assertThat(loginTitleNotDisplayed, $(loginTitle).isDisplayed());
        assertThat(loginTitleNotCorrect, $(loginTitle).text(), equalTo(loginTitleMain));
        return this;
    }

    @Step("Verify username input displayed and correct")
    public LoginPage verifyUsername() {
        assertThat(usernameInputNotDisplayed, $(usernameInput).isDisplayed());
        assertThat(usernamePlaceholderNotCorrect, $(usernameInput).getAttribute("placeholder"), equalTo(usernamePlaceholder));
        return this;
    }

    @Step("Verify password input is displayed and correct")
    public LoginPage verifyPassword() {
        assertThat(passwordInputNotDisplayed, $(passwordInput).isDisplayed());
        assertThat(passwordPlaceholderNotCorrect, $(passwordInput).getAttribute("placeholder"), equalTo(passwordPlaceholder));
        return this;
    }

    @Step("Type username")
    public LoginPage typeUsername(String userName) {
        $(usernameInput).setValue(userName);
        return this;
    }

    @Step("Type username")
    public LoginPage typePassword(String password) {
        $(passwordInput).setValue(password);
        return this;
    }

    @Step("Click on login button")
    public LoginPage clickOnSubmitBtn() {
        $(loginBtn).click();
        return this;
    }

    @Step("Verify error message is dispalyed and correct")
    public LoginPage verifyErrorMessageForNoAccount() {
        assertThat(errorMsgNotDisplayed, $(errorMsg).isDisplayed());
        assertThat(errorMsgNotCorrect, $(errorMsg).text(), equalTo(incorrectUser));
        return this;
    }
}
