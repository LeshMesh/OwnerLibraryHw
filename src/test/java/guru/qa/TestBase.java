package guru.qa;

import guru.qa.helpers.DriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    @BeforeAll
    static void setup() {
        DriverConfig.configure();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
