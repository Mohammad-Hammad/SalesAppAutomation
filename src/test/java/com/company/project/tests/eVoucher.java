package com.company.project.tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;

public class eVoucher extends AppTest{
    @Test
    public void test_eVoucherPrint(){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(664, 1494);
        var end = new Point (664, 648);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));

        var el1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.cardview.widget.CardView\").instance(5)"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.appcompat.widget.LinearLayoutCompat\").instance(2)"));
        el2.click();
        var el3 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/submitBtn"));
        el3.click();
        var el4 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/otpInclude"));
        el4.sendKeys("1234");
    }
    @Test
    public void test_eVoucherSMS(){
        var el1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.cardview.widget.CardView\").instance(5)"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.appcompat.widget.LinearLayoutCompat\").instance(1)"));
        el2.click();
        var el3 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/contactNumberEt"));
        el3.sendKeys("90000000");
        var el4 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/verifyClickArea"));
        el4.click();
        var el5 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/otpInclude"));
        el5.sendKeys("0000");
    }
}
