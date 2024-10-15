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

public class PostpaidPortin extends AppTest{
    @Test
    public void testPrepaidActivation(){
        var el1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.cardview.widget.CardView\").instance(5)"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.appcompat.widget.LinearLayoutCompat\").instance(2)"));
        el2.click();
        CommonActions commonActions = new CommonActions(driver,wait);
        commonActions.searchSubscription("123");
        commonActions.updateExpiryDate();

        var el3 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/selectBtn\").instance(0)")));
        el3.click();

        var el4 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/nextBtn")));
        el4.click();

        var el5 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/nextBtn")));
        el5.click();

        var el6 = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.salesapp.ooredoo.uat:id/portInNumberText")));
        el6.sendKeys("90000000");

        var el7 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/donorSpinner")));
        el7.click();

        var el8 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/portInPrepaidLayout")));
        el8.click();

        var el9 = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.salesapp.ooredoo.uat:id/mobileText")));
        el9.sendKeys("123");


        var el10 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/nextBtn")));
        el10.click();

        var el11 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"New address\")")));
        el11.click();
        var el12 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/citySpinner")));
        el12.click();
        var el13 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/poBoxTv")));
        el13.click();
        el13.sendKeys("Test");
        var el14 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/pcCodeTv")));
        el14.sendKeys("Test");
        var el15 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/landMarkTv")));
        el15.sendKeys("Test");
        var el16 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/homeNumberTv")));
        el16.sendKeys("Test");
        var el17 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/wayNumberTv")));
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

        driver.findElement(AppiumBy.androidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/buttonSave\"));" )).click();
//        var el24 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/buttonSave")));
//        el24.click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/buttonSave\")"));
        var el25 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().className(\"androidx.appcompat.widget.LinearLayoutCompat\").instance(2)")));
        el25.click();
        //com.salesapp.ooredoo.uat:id/buttonSave
        var el26 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/phoneTv")));
        el26.sendKeys("90000000");
        var el27 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/emailTv")));
        el27.sendKeys("mohammad212hammad@gmail.com");
        var el28 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/buttonSave")));
        el28.click();

        var el29 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/captionTv\").instance(0)")));
        el29.click();

        var el30 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));
        el30.click();

        var el31 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/capture_image_view")));
        el31.click();

        var el32 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/captionTv\").instance(0)")));
        el32.click();

        var el33 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/capture_image_view")));
        el33.click();

        var el34 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/captionTv")));
        el34.click();

        var el35 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/capture_image_view")));
        el35.click();

        driver.findElement(AppiumBy.androidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/privacyCheckBox\"));" ));
        var el36 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/privacyCheckBox")));
        el36.click();

        var el37 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/signatureView")));
        el37.click();

        var el38 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/buttonSave")));
        el38.click();

        var el39 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Show contract\")")));
        el39.click();

        var el40 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/doneBtn")));
        el40.click();

        driver.findElement(AppiumBy.androidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.salesapp.ooredoo.uat:id/submitButton\"));" ));
        var el41 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/submitButton")));
        el41.click();

        var el42 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/lottieBlockAnimation")));
        el42.click();

        var el43 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/tvBlockText")));
        el43.click();

        var el44 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/doneButton")));
        el44.click();
    }
}
