package steps;

import config.TestConfiguration;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {TestConfiguration.class})
public class BasicSteps {

    @Autowired
    AppiumDriver driver;


    @Given("^the user launches the app$")
    public void userLaunchesApp() throws Throwable {
            System.out.println("App launched");
    }
}
