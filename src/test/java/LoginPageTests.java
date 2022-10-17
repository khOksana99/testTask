import helpers.Utils;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {
    @Test(description = "Verify static check of page")
    public void verifyStaticCheckOfLoginPageTest() {
        loginFacade
                .staticCheckOfLoginPage();
    }

    @Test(description = "Verify there is no account for login")
    public void verifyErrorMessageForNoAccountTest() {
        loginFacade
                .login(Utils.getRandomUsername(), Utils.getRandomPassword())
                .verifyAccountNotCreated();
    }
}
