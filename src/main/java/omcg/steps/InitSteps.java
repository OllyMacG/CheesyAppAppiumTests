package omcg.steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.spring.CucumberContextConfiguration;
import omcg.AppiumCheesyApp;
import omcg.service.AppiumService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@CucumberContextConfiguration
@ContextConfiguration(classes = AppiumCheesyApp.class)
public class InitSteps {

    @Value("${appium.server}")
    private String appiumServer;
    @Value("${appium.wait}")
    private Long appiumWait;
    @Value("${appium.timeout}")
    private Long appiumTimeout;

    @Autowired
    private AppiumService appiumService;
    private AndroidDriver<AndroidElement> driver;

    public AndroidDriver<AndroidElement> getDriver() throws MalformedURLException {
        if (driver == null) {
            driver = new AndroidDriver(new URL(appiumServer), appiumService.getCapabilities());
            driver.manage().timeouts().implicitlyWait(appiumWait, TimeUnit.SECONDS);
        }
        return driver;
    }

    public AndroidElement waitForElement(AndroidElement element) {
        WebDriverWait wait = new WebDriverWait(driver, appiumTimeout);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    DesiredCapabilities getCapabilities() {
        return appiumService.getCapabilities();
    }

}

