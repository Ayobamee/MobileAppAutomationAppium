package org;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import org.SessionManager.StartDriverSession;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

class GesturesSwipe {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = StartDriverSession.initializeDriver("iOS");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");
        By grid = MobileBy.AccessibilityId("Grid");
        By animation = MobileBy.AccessibilityId("Animation");
        driver.findElement(views).click();

        By steppers = MobileBy.AccessibilityId("Steppers");
        By activityIndicators = MobileBy.AccessibilityId("Activity Indicators");

        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int endX = startX;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);

        TouchAction t = new TouchAction(driver);
        t.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();

        // TouchAction t = new TouchAction(driver);
        // t.press(ElementOption.element(driver.findElement(steppers)))
        //         .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
        //         .moveTo(ElementOption.element(driver.findElement(activityIndicators)))
        //         .release()
        //         .perform();
    }
}
//TAP, PRESS, LONGPRESS, WAITACTION, RELEASE, PERFORM, MOVETO