package omcg.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BasePage {

    protected final AppiumDriver driver;
    public WebDriverWait wait;
    static final long DEFAULT_EXPLICIT_WAIT = 30;
    static final long DEFAULT_IMPLICIT_WAIT = 10;
    public static Duration duration = Duration.of(DEFAULT_IMPLICIT_WAIT, ChronoUnit.SECONDS);


    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, duration), this);
        wait = new WebDriverWait(driver, DEFAULT_EXPLICIT_WAIT);
    }

}

