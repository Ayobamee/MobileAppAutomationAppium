package org;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import org.SessionManager.StartDriverSession;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = StartDriverSession.initializeDriver("iOS");
   //     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By alertViews = MobileBy.AccessibilityId("Alert Views");
        By okayCancel = MobileBy.AccessibilityId("Okay / Cancel");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(alertViews)).click();
     //   driver.findElement(alertViews).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(okayCancel)).click();
     //   driver.findElement(okayCancel).click();

// why not to use both implicit and explicit wait !!!???
    
    }}
