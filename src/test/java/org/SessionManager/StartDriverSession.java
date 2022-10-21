package org.SessionManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
// import java.net.MalformedURLException;
import java.net.URL;

public class StartDriverSession {

    public static AppiumDriver initializeDriver(String platformName) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        caps.setCapability("newCommandTimeout", 300);
        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        switch (platformName) {

            case "Android":
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                caps.setCapability(MobileCapabilityType.UDID, "ce11160b6c74430e02");

                String andappUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator
                        + File.separator
                        + "resources" + File.separator + "ApiDemos-debug.apk";
                caps.setCapability(MobileCapabilityType.APP, andappUrl);

                return new AndroidDriver(url, caps);

            case "iOS":
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Iphone 11");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                caps.setCapability(MobileCapabilityType.UDID, "ce11160b6c74430e02");

                String iOSappUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator
                        + File.separator
                        + "resources" + File.separator + "ApiDemos-debug.apk";
                caps.setCapability(MobileCapabilityType.APP, iOSappUrl);

                return new IOSDriver(url, caps);

            default:
                throw new Exception("invalid platform");

        }

    }
}
