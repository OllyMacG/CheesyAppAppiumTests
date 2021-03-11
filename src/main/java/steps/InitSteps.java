package steps;

import config.TestConfiguration;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {TestConfiguration.class})
public class InitSteps {
    @Autowired
    private AppiumDriver driver;

    @Before
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @After
    public void afterMethod(Scenario scenario) {
        System.out.println("After Method");

    }

}

