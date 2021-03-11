package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;

@Configuration
@ComponentScan(basePackages = {"pages", "steps"})
public class TestConfiguration {

    @Bean(destroyMethod = "quit")
    public AppiumDriver androidAppiumDriver() throws MalformedURLException {

        AppiumDriver driver = null;

        DesiredCapabilities capabilities = DesiredCapabilities.android();
        capabilities.setCapability("build", "Appium Spring Cucumber Cheesy App");
        capabilities.setCapability("name", "Samsung Galaxy S4");

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S4 Emulator");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.APP, "");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 180);
        capabilities.setCapability("deviceOrientation", "portrait");

        driver = new AndroidDriver(capabilities);

        return driver;
    }
}

