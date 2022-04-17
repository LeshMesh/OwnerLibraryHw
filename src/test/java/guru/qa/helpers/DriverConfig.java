package guru.qa.helpers;

import com.codeborne.selenide.Configuration;
import guru.qa.config.Project;

public class DriverConfig {

    public static void configure() {

        Configuration.browser = Project.config.browserName();
        Configuration.browserVersion = Project.config.browserVersion();
        Configuration.browserSize = Project.config.browserSize();

        if (Project.isRemoteWebDriver()) {
            Configuration.remote = Project.config.remoteUrl();
        }
    }
}
