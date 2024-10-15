package com.company.project.tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Login_iOS extends AppTestiOS {
    @Test
    public void testLogin_iOS(){
        var el9 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Sign In\"`]")));
        el9.click();
// Wait for and input the username
        var el10 = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("User name")));
        el10.sendKeys("100");
// Wait for and click the "Return" key
        var el11 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Return")));
        el11.click();
// Wait for and input the password
        var el12 = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Password")));
        el12.sendKeys("1234");
// Wait for and click the "Return" key again
        var el13 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Return")));
        el13.click();
// Wait for and click the second "Sign In" button
        var el14 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Sign In\"`][2]")));
        el14.click();
    }
}