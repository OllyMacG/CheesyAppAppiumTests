package omcg.steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class BasicSteps extends InitSteps {

    @Value("${appium.sleep}")
    private Long timeToSleep;

    private AndroidElement textView;
    private AndroidDriver<AndroidElement> driver;

    private Logger log = Logger.getLogger(this.getClass().getName());

    @When("the user launches the app")
    public void shouldLaunchTheApplication() throws Exception {
        log.info("Running: I launch the application at " + new Date());
        driver = getDriver();
        driver.launchApp();
    }

    @Then("the user is on the login screen")
    public void shouldDisplayCategories() throws Exception {
        log.info("Running: I should be able to see the category list at " + new Date());
        assumeTrue(driver.findElement(By.id("listViewCategories")) != null);
        textView = driver.findElement(By.id("categoryTextView"));
        assertEquals("Curativos", textView.getText());
    }

}

