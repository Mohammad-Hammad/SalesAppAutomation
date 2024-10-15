package com.company.project.tests;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTestWeb {
    protected static WebDriver chromeDriver;

    @BeforeClass
    public void setUp() {
        // Setup ChromeDriver for web automation
        System.setProperty("webdriver.chrome.driver", "/Users/leadingpoint/IdeaProjects/AppiumPoc/ChromeDriver/chromedriver");
        chromeDriver = new ChromeDriver();
    }
    public static WebDriver getDriver() {
        return chromeDriver;
    }
//    @AfterClass
//    public void tearDown() {
//        if (chromeDriver != null) {
//            chromeDriver.quit();
//        }
//    }
}
