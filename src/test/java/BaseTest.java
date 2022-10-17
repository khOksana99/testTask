import driver.DriverConfig;
import facade.LoginFacade;
import org.testng.annotations.BeforeClass;
import pages.BasePage;

public class BaseTest {
    protected LoginFacade loginFacade;
    protected BasePage basePage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        DriverConfig.initializeDriver();
        basePage = new BasePage();
        loginFacade = new LoginFacade();
        basePage.openLoginPagePage();
    }
}
