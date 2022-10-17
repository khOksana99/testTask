package driver;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Browsers.CHROME;

public class DriverConfig {
    private DriverConfig(){

    }

    public static void initializeDriver() {
        Configuration.timeout = 15000;
        Configuration.pageLoadTimeout = 15000;
        Configuration.browser = CHROME;
        Configuration.downloadsFolder = "downloads";
        Configuration.startMaximized = true;
        Configuration.reopenBrowserOnFail = true;
        Configuration.proxyEnabled = true;
    }
}
