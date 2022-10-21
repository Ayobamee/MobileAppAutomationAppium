package org;

import org.SessionManager.StartDriverSession;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidFindElements {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = StartDriverSession.initializeDriver("Android");
        // Find element by accessibility ID
        MobileElement myElement = (MobileElement) driver.findElementByAccessibilityId("Accessibility");
        System.out.print(myElement.getText());

        // Find element by resource ID
        myElement = (MobileElement) driver.findElementById("android:id/text1");
        System.out.print(myElement.getText());

        // Find element by Class name
        myElement = (MobileElement) driver.findElementByClassName("android.widget.TextView");
        System.out.print(myElement.getText());

        // Find element by Xpath
        myElement = (MobileElement) driver
                .findElementByXPath("//android.widget.TextView[@content-desc=\"Accessibility\"]");
        System.out.print(myElement.getText());

        // Do not find elements by Name & Tagname using Appium

    }

}
