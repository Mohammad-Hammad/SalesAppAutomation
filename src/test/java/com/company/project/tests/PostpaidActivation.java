package com.company.project.tests;

import com.company.project.tests.AppTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.Map;

public class PostpaidActivation extends AppTest {
    @Test
    public void testPostpaidActivation() throws InterruptedException {
        var el1 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.cardview.widget.CardView\").instance(2)")));
        el1.click();

        CommonActions commonActions = new CommonActions(driver,wait);
        commonActions.searchSubscription("123");
        commonActions.updateExpiryDate();


        var el2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/selectBtn\").instance(0)")));
        el2.click();
        var el3 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/nextBtn")));
        el3.click();
        var el4 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Voice\")")));
        el4.click();
        var el5 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/selectBtn")));
        el5.click();

        driver.executeScript("mobile: pressKey", Map.ofEntries(Map.entry("keycode", 4)));

        var el6 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Data\")")));
        el6.click();
        var el7 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/selectBtn")));
        el7.click();
        driver.executeScript("mobile: pressKey", Map.ofEntries(Map.entry("keycode", 4)));

        var el8 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Passport\")")));
        el8.click();
        var el9 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/selectBtn")));
        el9.click();
        var el10 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/saveBtn")));
        el10.click();

        var el12 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/nextBtn")));
        el12.click();
        var el11 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/mobileText")));
        el11.sendKeys("123");

        var el213 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/nextBtn")));
        el213.click();

        var el13 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.appcompat.widget.LinearLayoutCompat\").instance(1)")));
        el13.click();
        var el14 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/citySpinner")));
        el14.click();
        var el15 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/poBoxTv")));
        el15.click();
        var el16 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/poBoxTv")));
        el16.sendKeys("Test");
        var el17 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/pcCodeTv")));
        el17.sendKeys("Test");
        var el18 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/regionSpinner")));
        el18.click();
        var el19 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/titleLl")));
        el19.click();
        var el20 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/walleyeSpinner")));
        el20.click();
        var el21 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/titleLl")));
        el21.click();
        var el22 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/localitySpinner")));
        el22.click();
        var el23 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/titleLl")));
        el23.click();
        var el24 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/wayNumberTv")));
        el24.sendKeys("Test");
        var el25 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/homeNumberTv")));
        el25.sendKeys("Test");
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/buttonSave\"))"));
        var el26 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/landMarkTv")));
        el26.sendKeys("Test");
        var el27 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/buttonSave")));
        el27.click();

        // Wait until element is clickable and click
        var el90 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.appcompat.widget.LinearLayoutCompat\").instance(2)")));
        el90.click();

// Wait until element is visible and send keys
        var el91 = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.salesapp.ooredoo.uat:id/phoneTv")));
        el91.sendKeys("90000000");

// Wait until element is visible and send keys
        var el92 = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.salesapp.ooredoo.uat:id/emailTv")));
        el92.sendKeys("a@b.com");

// Wait until element is clickable and click
        var el93 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/buttonSave")));
        el93.click();


// Wait for el1 and click
        var el100 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.appcompat.widget.LinearLayoutCompat\").instance(3)")));
        el100.click();

// Wait for el2 and click
        var el101 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));
        el101.click();

// Wait for el3 and click
        var el102 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/capture_image_view")));
        el102.click();

// Wait for el4 and click
        var el103 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/captionTv\").instance(0)")));
        el103.click();

// Wait for el5 and click
        var el104 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/capture_image_view")));
        el104.click();

// Wait for el6 and click


        var el105 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.appcompat.widget.LinearLayoutCompat\").instance(4)")));
        el105.click();

// Wait for el7 and click
        var el106 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/capture_image_view")));
        el106.click();


        //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/showContractLL\"))"));
// Wait for el8 and click
        var el107 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/showContractLL")));
        el107.click();

// Wait for el9 and click
        var el108 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/doneBtn")));
        el108.click();


        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/privacyCheckBox\"));"));
        var el109 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/privacyCheckBox")));
        el109.click();



        var el110 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/signatureView")));
        el110.click();
        var el111 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/buttonSave")));
        el111.click();

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/submitButton\"));"));
        var el112 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/submitButton")));
        el112.click();

        var el113 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/doneButton")));
        el113.click();

    }
}
