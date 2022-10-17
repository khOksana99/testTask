package facade;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import pages.BasePage;

public abstract class BaseFacade <T extends BaseFacade<T>> {
    private BasePage basePage;

    public BaseFacade() {
        basePage = new BasePage();
    }

    @Step("Refresh page")
    public T refreshPage() {
        Selenide.refresh();
        return (T) this;
    }
}
