package com.company.project.tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;

public class PrepaidPortin extends AppTest {
    @Test
    public void testPrepaidPortin() {
        var el1 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.cardview.widget.CardView\").instance(5)")));
        el1.click();

        var el2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.appcompat.widget.LinearLayoutCompat\").instance(1)")));
        el2.click();

        CommonActions commonActions = new CommonActions(driver, wait);
        commonActions.searchSubscription("123");
        commonActions.updateExpiryDate();

        var el3 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/portInNumberText")));
        el3.sendKeys("90000000");

        var el4 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/donorSpinner")));
        el4.click();

        var el5 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/portInPrepaidLayout")));
        el5.click();

        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(589, 1771);
        var end = new Point(597, 545);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));

        var el6 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/eSimRadio")));
        el6.click();

        var el7 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/physicalRadio")));
        el7.click();

        var el8 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/mobileText")));
        el8.click();
        el8.sendKeys("123");

        final var finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var tapPoint = new Point(929, 1707);
        var tap = new Sequence(finger2, 1);
        tap.addAction(finger2.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
        tap.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger2, Duration.ofMillis(50)));
        tap.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap));

        driver.executeScript("mobile: hideKeyboard");

        final var finger3 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start2 = new Point(783, 1486);
        var end2 = new Point(783, 458);
        var swipe2 = new Sequence(finger3, 1);
        swipe2.addAction(finger3.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start2.getX(), start2.getY()));
        swipe2.addAction(finger3.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe2.addAction(finger3.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end2.getX(), end2.getY()));
        swipe2.addAction(finger3.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe2));

        var el9 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/selectBtn\").instance(0)")));
        el9.click();

        final var finger4 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start4 = new Point(743, 1830);
        var end4 = new Point(743, 130);
        var swipe4 = new Sequence(finger4, 1);
        swipe4.addAction(finger4.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start4.getX(), start4.getY()));
        swipe4.addAction(finger4.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe4.addAction(finger4.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end4.getX(), end4.getY()));
        swipe4.addAction(finger4.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe4));

        var el10 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/captionTv")));
        el10.click();

        var el11 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));
        el11.click();

        var el12 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/capture_image_view")));
        el12.click();

        var el13 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/captionTv")));
        el13.click();

        var el14 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/capture_image_view")));
        el14.click();

        var el15 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/privacyCheckBox")));
        el15.click();

        var el16 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/signatureView")));
        el16.click();

        var el17 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/buttonSave")));
        el17.click();

        final var finger5 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start5 = new Point(692, 1213);
        var end5 = new Point(692, 866);
        var swipe5 = new Sequence(finger5, 1);
        swipe5.addAction(finger5.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start5.getX(), start5.getY()));
        swipe5.addAction(finger5.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe5.addAction(finger5.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end5.getX(), end5.getY()));
        swipe5.addAction(finger5.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe5));

        var el18 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/activateButton")));
        el18.click();

        var el19 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/otpInclude")));
        el19.sendKeys("1234");

        var el20 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/doneButton")));
        el20.click();
    }
}
