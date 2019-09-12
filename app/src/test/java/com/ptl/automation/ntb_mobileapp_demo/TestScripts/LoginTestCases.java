package com.ptl.automation.ntb_mobileapp_demo.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginTestCases {

    AppiumDriver<MobileElement> appiumDriver;
    DesiredCapabilities capabilities;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        // Set the Desired Capabilities
        /* Created object of DesiredCapabilities class. */
        capabilities = new DesiredCapabilities();

        /* Set android deviceName desired capability. Set your device name. */
        capabilities.setCapability("deviceName", "J5");

        /* Set Device ID of your mobile phone */
        capabilities.setCapability("udid", "emulator-5554");

        /*
         * Set android platformName desired capability. It's Android in our case here.
         */
        capabilities.setCapability("platformName", "Android");

        /*
         * Set android VERSION desired capability. Set your mobile device's OS version.
         */
        capabilities.setCapability("platformVersion", "7.1.1");

        /*
         * Set android appPackage desired capability. It is com.android.calculator2 for
         * calculator application. Set your application's appPackage if you are using
         * any other app.
         */
        capabilities.setCapability("appPackage", "net.omobio.dialogsc");

        /*
         * Set android appActivity desired capability. It is
         * com.android.calculator2.Calculator for calculator application. Set your
         * application's appPackage if you are using any other app.
         */
        capabilities.setCapability("appActivity", "net.omobio.dialogsc.MainActivity");

    }

    @Test
    public void testFirstCalculator() {


        // Click on DELETE/CLR button to clear result text box before running test.
        appiumDriver.findElements(By.xpath("//android.widget.Button")).get(0).click();



        appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
