package omcg.service;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AppiumServiceImpl implements AppiumService {

    @Value("${device.name}")
    private String deviceName;
    @Value("${device.platform}")
    private String devicePlatform;
    @Value("${application.package}")
    private String applicationPackage;
    @Value("${application.activity}")
    private String applicationActivity;
    @Value("${application.appLocation}")
    private String appLocation;

    private DesiredCapabilities capabilities = new DesiredCapabilities();

    @PostConstruct
    public void setup(){
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("app", appLocation);
        capabilities.setCapability("platformName", devicePlatform);
        capabilities.setCapability("appPackage", applicationPackage);
        capabilities.setCapability("appActivity", applicationActivity);
    }

    public DesiredCapabilities getCapabilities(){
        return capabilities;
    }

}