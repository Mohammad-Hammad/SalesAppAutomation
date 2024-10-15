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

public class AppTestiOS {
    protected static AppiumDriver driver;
    protected static WebDriverWait wait;
    @BeforeClass
    public static void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("appium:deviceName", "Mohammad Hammad iPhone");
        cap.setCapability("appium:udid", "00008130-000449A81442001C");
        cap.setCapability("appium:platformName", "iOS");
        cap.setCapability("appium:platformVersion", "18.0.1");
        cap.setCapability("appium:automationName", "XCUITest");
        cap.setCapability("appium:bundleId","com.leading-point.ooredoo.temp");
        cap.setCapability("appium:noReset", "false");  // Keeps the app data and state between tests

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url, cap);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        System.out.println("App Started");
    }
    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    public static AppiumDriver getDriver() {
        return driver;
    }
}
