package com.company.project.tests;

import com.company.project.tests.AppTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrepaidActivation extends AppTest {
    public static String buttonText;
    @Test //(dependsOnMethods = "com.company.project.tests.Login.testLogin")
    public void testPrepaidActivation() {
        CommonActions commonActions = new CommonActions(driver, wait);

        var el1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.cardview.widget.CardView\").instance(1)"));
        el1.click();

        commonActions.searchSubscription("123");
        commonActions.updateExpiryDate();

        var el2 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/mobileText"));
        el2.sendKeys("123");
        el2.click();

        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var tapPoint = new Point(933, 1711);
        var tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap));

        driver.executeScript("mobile: hideKeyboard");
        var el3 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(2)"));
        el3.click();
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/selectBtn\"))"));

        var el4 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/selectBtn\").instance(0)")));
        el4.click();
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/activateButton\"))"));
        var test = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Capture document \")")));
        test.click();
        var el6 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));
        el6.click();
        var el7 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/capture_image_view")));
        el7.click();
        var el8 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Capture document \")")));
        el8.click();
        var el9 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/capture_image_view")));
        el9.click();
        var el10 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/privacyCheckBox")));
        el10.click();
        var el11 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/signatureView")));
        el11.click();
        var el12 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/buttonSave")));
        el12.click();
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/activateButton\"))"));
        var el13 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/activateButton")));
        el13.click();
        var el14 = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.salesapp.ooredoo.uat:id/otpInclude")));
        el14.sendKeys("1234");
        var el15 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/doneButton")));
        el15.click();
    }
}
