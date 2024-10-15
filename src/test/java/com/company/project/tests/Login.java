package com.company.project.tests;

import com.company.project.tests.AppTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Login extends AppTest {
    @Test
    public void testLogin() {
        //com.company.project.tests.Login
//        var el1 = driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
//        el1.click();
        var el1 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));
        el1.click();
        var el2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.salesapp.ooredoo.uat:id/singInButton")));
        el2.click();
        var el3 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")));
        el3.click();
        var el4 = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.salesapp.ooredoo.uat:id/idEditText")));
        el4.sendKeys("100");
        var el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.salesapp.ooredoo.uat:id/passwordEditText")));
        el5.sendKeys("1234");
        var el6 = driver.findElement(AppiumBy.id("com.salesapp.ooredoo.uat:id/buttonLoginFragmentLogin"));
        el6.click();
    }
}
