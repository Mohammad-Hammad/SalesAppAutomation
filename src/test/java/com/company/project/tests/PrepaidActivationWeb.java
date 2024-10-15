package com.company.project.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PrepaidActivationWeb extends AppTestWeb{
    @Test
    public void PrepaidAcceptWeb() throws InterruptedException {

        chromeDriver.get("https://ooqa.salespoint.live/");
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Email']")));
        chromeDriver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("admin");
        chromeDriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
        chromeDriver.findElement(By.xpath("//button[@type='button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='mk_apps_sidebar_icon fa-cart-plus']")));
        chromeDriver.findElement(By.xpath("//body/header/nav[@class='o_main_navbar']/div[@class='mk_apps_sidebar_panel']/div[@class='mk_apps_sidebar']/ul[@class='mk_apps_sidebar_menu']/li[9]/div[1]")).click();
        chromeDriver.findElement(By.xpath("//a[contains(text(),'Mobile Prepaid')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search...']")));
        chromeDriver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("96126566");
        chromeDriver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys(Keys.ENTER);
        chromeDriver.findElement(By.xpath("//tbody/tr[1]/td[6]")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='action_accept_request']")));

        // Locate the button by a unique selector (in this case by data-value or any other unique attribute)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-value='7' and @role='radio']")));
        WebElement pendingStage = chromeDriver.findElement(By.xpath("//button[@data-value='7' and @role='radio']"));

        // Get the value of the 'title' attribute
        String buttonTitle = pendingStage.getAttribute("title");
        // Validate if the button is the current stage by checking if the title contains "Current state"
        if (buttonTitle.equals("Current state")) {
            System.out.println("The button indicates the current stage.");
        } else {
            System.out.println("The button is not the current stage.");
        }
        // Alternatively, you can assert this in a test case
        //Assert.assertEquals(buttonTitle, "Current state", "The pending stage is not the current stage!");

        Thread.sleep(20000);
        chromeDriver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='action_accept_request']")));
        chromeDriver.findElement(By.xpath("//button[@name='action_accept_request']")).click();

        Thread.sleep(30000);
        chromeDriver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-value='10' and @role='radio']")));
        WebElement completedStage = chromeDriver.findElement(By.xpath("//button[@data-value='10' and @role='radio']"));
        String buttonTitle2 = completedStage.getAttribute("title");
        Thread.sleep(10000);
        // Validate if the button is the current stage by checking if the title contains "Current state"
        if (buttonTitle2.equals("Current state")) {
            System.out.println("The button indicates the current stage.");
        } else {
            System.out.println("The button is not the current stage.");
        }
    }
}
