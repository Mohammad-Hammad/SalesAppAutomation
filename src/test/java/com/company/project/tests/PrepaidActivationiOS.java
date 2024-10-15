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
import java.util.HashMap;
import java.util.List;

public class PrepaidActivationiOS extends AppTestiOS {
    public static String buttonText;
    @Test //(dependsOnMethods = "com.company.project.tests.Login.testLogin")
    public void testPrepaidActivationiOS() {
        CommonActions commonActions = new CommonActions(driver, wait);
// Wait declaration (adjust timeout as necessary)

// Wait and click on element 2
        var el2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \" \"`][8]")));
        el2.click();

// Wait and click on element 3
        var el3 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("ID type")));
        el3.click();

// Wait and send keys to element 4
        var el4 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("ID number")));
        el4.sendKeys("123");

// Wait and click on element 5
        var el5 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Search\"`]")));
        el5.click();

// Wait and click on element 6
        var el6 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("ID Expiry Date")));
        el6.click();

// Wait and click on element 7
        var el7 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("DatePicker.NextMonth")));
        el7.click();

// Wait and click on element 8
        var el8 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("30")));
        el8.click();

// Wait and click on element 9
        var el9 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Done")));
        el9.click();

// Wait and click on element 10
        var el10 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Submit\"`]")));
        el10.click();

// Wait, click, and send keys to element 11
        var el11 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("ICCID")));
        el11.click();
        el11.sendKeys("123");

// Wait and click on element 12
        var el12 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Done")));
        el12.click();


        boolean isElementVisible = false;

        while (!isElementVisible) {
            try {
                // Attempt to find the element
                driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Select\"`][15]")).click();
                isElementVisible = true; // Element found, exit the loop
            } catch (Exception e) {
                // If element not found, scroll down
                HashMap<String, String> scrollObject = new HashMap<>();
                scrollObject.put("direction", "down");
                scrollObject.put("predicateString", "name == 'Select'");
                scrollObject.put("toVisible", "true");
                driver.executeScript("mobile: scroll", scrollObject);
            }
        }
        boolean isElementVisible2 = false;

        while (!isElementVisible2) {
            try {
                // Attempt to find the element
                driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")).click();
                isElementVisible2 = true; // Element found, exit the loop
            } catch (Exception e) {
                // If element not found, scroll down
                HashMap<String, String> scrollObject = new HashMap<>();
                scrollObject.put("direction", "down");
                scrollObject.put("predicateString", "type == 'XCUIElementTypeButton'");
                scrollObject.put("toVisible", "true");
                driver.executeScript("mobile: scroll", scrollObject);
            }
        }


// Wait and click on element 15
        var el15 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("PhotoCapture")));
        el15.click();

// Wait and click on element 16
        var el16 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Use Photo")));
        el16.click();

// Wait and click on element 17

        boolean isElementVisible3 = false;

        while (!isElementVisible3) {
            try {
                // Attempt to find the element
                driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
                isElementVisible3 = true; // Element found, exit the loop
            } catch (Exception e) {
                // If element not found, scroll down
                HashMap<String, String> scrollObject = new HashMap<>();
                scrollObject.put("direction", "down");
                scrollObject.put("predicateString", "type == 'XCUIElementTypeButton'");
                scrollObject.put("toVisible", "true");
                driver.executeScript("mobile: scroll", scrollObject);
            }
        }



// Wait and click on element 18
        var el18 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("PhotoCapture")));
        el18.click();

// Wait and click on element 19
        var el19 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Use Photo")));
        el19.click();


        boolean isElementVisible4 = false;

        while (!isElementVisible4) {
            try {
                // Attempt to find the element
                driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")).click();
                isElementVisible4 = true; // Element found, exit the loop
            } catch (Exception e) {
                // If element not found, scroll down
                HashMap<String, String> scrollObject = new HashMap<>();
                scrollObject.put("direction", "down");
                scrollObject.put("predicateString", "type == 'XCUIElementTypeButton'");
                scrollObject.put("toVisible", "true");
                driver.executeScript("mobile: scroll", scrollObject);
            }
        }


// Wait and click on element 20
//        var el20 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")));
//        el20.click();

// Wait and click on element 21
        var el21 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeScrollView")));
        el21.click();

// Wait and click on element 22
        var el22 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save\"`]")));
        el22.click();

// Wait and click on element 23

        boolean isElementVisible5 = false;

        while (!isElementVisible5) {
            try {
                // Attempt to find the element
                driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Submit\"`]")).click();
                isElementVisible5 = true; // Element found, exit the loop
            } catch (Exception e) {
                // If element not found, scroll down
                HashMap<String, String> scrollObject = new HashMap<>();
                scrollObject.put("direction", "down");
                scrollObject.put("predicateString", "type == 'XCUIElementTypeStaticText' && name == 'Submit'");
                scrollObject.put("toVisible", "true");
                driver.executeScript("mobile: scroll", scrollObject);
            }
        }
// Wait, click, and send keys to element 24
        var el24 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")));
        el24.sendKeys("1234");

// Wait and click on element 25
        var el25 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Done\"`]")));
        el25.click();

    }
}
