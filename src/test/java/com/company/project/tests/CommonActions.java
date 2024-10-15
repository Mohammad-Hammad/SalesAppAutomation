package com.company.project.tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;

public class CommonActions {

    private AppiumDriver driver;
    private WebDriverWait wait;

    // Constructor to initialize driver and wait
    public CommonActions(AppiumDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void searchSubscription(String idNumber) {
        var el2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//*[@text='ID type']")));
        el2.click();
        var el3 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/idNumberText"));
        el3.click();
        var el4 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/idNumberText"));
        el4.click();
        el4.sendKeys(idNumber);
        var el11 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/searchButton")));
        el11.click();
    }
    public void searchSubscriptioniOS(String idNumber) {

    }
    public void updateExpiryDate() {
        var el1 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/expiryDateText")));
        el1.click();
        var el2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Next month")));
        el2.click();
        var el3 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"30\")\n")));
        el3.click();
        var el4 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("android:id/button1")));
        el4.click();
        var el5 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/positiveButton")));
        el5.click();
    }
    public void updateExpiryDateiOS() {

    }
    public void newCustomer() {

    }
}
