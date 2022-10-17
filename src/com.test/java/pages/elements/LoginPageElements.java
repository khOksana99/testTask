package pages.elements;

import org.openqa.selenium.By;

public interface LoginPageElements {
    By mainIcon = By.id("logomini");
    By loginTitle = By.xpath("//div[@class='wrapper']//h1");
    By usernameInput = By.cssSelector("input[name='username']");
    By passwordInput = By.cssSelector("input[name='password']");
    By loginBtn = By.cssSelector("input[type='submit']");
    By errorMsg = By.className("help-block");
}
