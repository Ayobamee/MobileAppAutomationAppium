package org;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import org.example.StartDriverSession;
import org.openqa.selenium.By;

public class FetchElementAttributes {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = StartDriverSession.initializeDriver("Android");

        By accessibility = MobileBy.AccessibilityId("Accessibility");
        System.out.println("text:" + driver.findElement(accessibility).getText());
        System.out.println("text:" + driver.findElement(accessibility).getAttribute("text"));
        System.out.println("checked:" + driver.findElement(accessibility).getAttribute("checked"));
        System.out.println("enabled:" + driver.findElement(accessibility).getAttribute("enabled"));
        System.out.println("selected:" + driver.findElement(accessibility).getAttribute("selected"));
        System.out.println("displayed:" + driver.findElement(accessibility).getAttribute("displayed"));

        // System.out.println("selected:" + driver.findElement(accessibility).isSelected());
        // System.out.println("enabled:" + driver.findElement(accessibility).isEnabled());
        // System.out.println("displayed:" + driver.findElement(accessibility).isDisplayed());
    }
}
// How to fetch element attributes?