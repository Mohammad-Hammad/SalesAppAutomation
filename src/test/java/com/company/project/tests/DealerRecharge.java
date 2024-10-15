package com.company.project.tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;

public class DealerRecharge extends AppTest{
    @Test
    public void testDealerRecharge(){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(458, 1929);
        var end = new Point (514, 304);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));


        final var finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start2 = new Point(352, 1937);
        var end2 = new Point (411, 320);
        var swipe2 = new Sequence(finger2, 1);
        swipe2.addAction(finger2.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start2.getX(), start2.getY()));
        swipe2.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe2.addAction(finger2.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end2.getX(), end2.getY()));
        swipe2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe2));


        var el1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.cardview.widget.CardView\").instance(5)"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/voucherCodeEt"));
        el2.sendKeys("123456789");
        var el3 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/rechargeBtn"));
        el3.click();
        var el4 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/tvBlockText"));
        el4.click();
        var el5 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/doneButton"));
        el5.click();
    }
}
