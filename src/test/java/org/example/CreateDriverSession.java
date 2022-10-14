package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, "ce11160b6c74430e02");
        caps.setCapability("newCommandTimeout", 300);
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + File.separator
                + "resources" + File.separator + "ApiDemos-debug.apk";
        caps.setCapability(MobileCapabilityType.APP, appUrl);

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AppiumDriver driver = new AndroidDriver(url, caps);

    }
}
