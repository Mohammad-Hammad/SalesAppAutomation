package com.company.project.tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;


public class AppTest {
    protected static AppiumDriver driver;
    protected static WebDriverWait wait;
    @BeforeClass
    public static void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("appium:deviceName", "S10");
//        cap.setCapability("appium:udid", "R3CM40EH8GZ");
//        cap.setCapability("appium:platformName", "Android");
//        cap.setCapability("appium:platformVersion", "12");
//        cap.setCapability("appium:automationName", "UiAutomator2");
//        cap.setCapability("appium:appPackage", "com.salesapp.ooredoo.uat");
//        cap.setCapability("appium:appActivity", "com.leadingpoint.salesapp.modules.main.ui.views.MainActivity");

        cap.setCapability("appium:deviceName", "Galaxy S22 Ultra");
        cap.setCapability("appium:udid", "R5CTA2106ZZ");
        cap.setCapability("appium:platformName", "Android");
        cap.setCapability("appium:platformVersion", "14");
        cap.setCapability("appium:automationName", "UiAutomator2");
        cap.setCapability("appium:appPackage", "com.salesapp.ooredoo.uat");
        cap.setCapability("appium:appActivity", "com.leadingpoint.salesapp.modules.main.ui.views.MainActivity");
        cap.setCapability("appium:noReset", "true");  // Keeps the app data and state between tests

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url, cap);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        System.out.println("App Started");
    }
    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.executeScript("mobile: shell", ImmutableMap.of("command", "pm clear com.salesapp.ooredoo.uat"));
            driver.quit();
        }
    }
    public static AppiumDriver getDriver() {
        return driver;
    }
//    @Test
//    public void reset(){
//        driver.executeScript("mobile: shell", ImmutableMap.of("command", "pm clear com.salesapp.ooredoo.uat"));
//    }
}
