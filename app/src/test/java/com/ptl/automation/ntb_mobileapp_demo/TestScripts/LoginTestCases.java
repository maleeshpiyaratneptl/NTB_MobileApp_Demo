package com.ptl.automation.ntb_mobileapp_demo.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginTestCases {

    AppiumDriver<MobileElement> appiumDriver;

    DesiredCapabilities capabilities;
    WebDriver driver;
    @BeforeTest
    public void setUp() throws MalformedURLException {

        // Set the Desired Capabilities
        /* Created object of DesiredCapabilities class. */
        capabilities = new DesiredCapabilities();

        /* Set android deviceName desired capability. Set your device name. */
        capabilities.setCapability("deviceName", "Android SDK built for x86");

        /* Set Device ID of your mobile phone */
        capabilities.setCapability("udid", "emulator-5554");

        /*
         * Set android platformName desired capability. It's Android in our case here.
         */
        capabilities.setCapability("platformName", "Android");

        /*
         * Set android VERSION desired capability. Set your mobile device's OS version.
         */
        capabilities.setCapability("platformVersion", "9");

        /*
         * Set android appPackage desired capability. It is com.android.calculator2 for
         * calculator application. Set your application's appPackage if you are using
         * any other app.
         */
        capabilities.setCapability("appPackage", "com.android.vending");

        /*
         * Set android appActivity desired capability. It is
         * com.android.calculator2.Calculator for calculator application. Set your
         * application's appPackage if you are using any other app.
         */
        capabilities.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");

        // Created object of RemoteWebDriver will all set capabilities.
        // Set appium server address and port number in URL string.
        // It will launch calculator app in android device.
//      driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        appiumDriver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    public void testFirstCalculator() {


        //Instantiate AppiumDriver
//        try {
//            appiumDriver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
//        } catch (MalformedURLException e) {
//            System.out.println(e.getMessage());
//        }


        //try {
//            appiumDriver.findElements(By.id("Search")).get(0).click();

        appiumDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Search\"]")).click();
//        appiumDriver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText\n"))
//                    .get(0).sendKeys("MyDialog"+ Keys.ENTER);
        appiumDriver.findElement(By.id("com.android.vending:id/search_box_text_input")).click();
        appiumDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Search\"]")).click();



        //} catch (NullPointerException e) {
            //System.out.println(e.getMessage());
        //}
    }

    @AfterTest
    public void End() {
//        appiumDriver.quit();
    }

}
