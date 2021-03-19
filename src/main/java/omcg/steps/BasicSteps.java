package omcg.steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import omcg.pages.LoginPage;

import java.net.MalformedURLException;
import java.util.Date;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class BasicSteps extends InitSteps {

    protected AndroidDriver<AndroidElement> driver;

    private Logger log = Logger.getLogger(this.getClass().getName());

    @When("the user launches the app")
    public void shouldLaunchTheApplication() throws Exception {
        log.info("Running: I launch the application at " + new Date());
        driver = getDriver();
//        driver.launchApp();
    }

    @Then("the user is on the {string} screen")
    public void correctScreenIsDisplayed(String expectedScreen) throws Exception {
        driver = getDriver();
        assertEquals("NEXT", new LoginPage(driver).loginButton.getText());
    }

    @And("the user enters {string} into {string} on the {string}")
    public void theUserEntersIntoOnThe(String arg0, String arg1, String arg2) throws MalformedURLException {
        driver = getDriver();

    }

    @When("the user clicks {string} on the {string}")
    public void theUserClicksOnThe(String arg0, String arg1) throws MalformedURLException {
        driver = getDriver();

    }
}

