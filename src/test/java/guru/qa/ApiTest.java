package guru.qa;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import guru.qa.config.ApiConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiTest {

    @Test
    public void apiTests() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(config.baseURL()).isEqualTo("https://www.github.com/");
        assertThat(config.token()).isEqualTo("tokenGitHub");
    }
}
