package com.company.project.tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;

public class eTopUp extends AppTest {
    @Test (dependsOnMethods = "com.company.project.tests.Login.testLogin")
    public void test_eTopUp(){
        
    }
}
