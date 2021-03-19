package omcg.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public class LoginPage extends BasePage {

    protected AndroidDriver<AndroidElement> driver;

    @AndroidFindBy(id = "next_button")
    public AndroidElement loginButton;

    public LoginPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, duration), this);
        wait = new WebDriverWait(driver, DEFAULT_EXPLICIT_WAIT);
    }
}
