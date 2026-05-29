package com.framework.tests.ui;

import com.framework.core.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
    WebDriver driver;
    DriverManager driverManager;

    @BeforeMethod
    public void setup() {
    	driverManager = new DriverManager();
        driver = driverManager.getDriver();
        driver.get("https://www.flipkart.com/");
    }

    @Test
    public void testLogin() {
    	System.out.println(driver.getTitle());
<<<<<<< HEAD
    	System.out.println("Hello");
=======
>>>>>>> bd7267f3e4d3ef7767ef9082fc2b5e9a6fa30e76
        Assert.assertTrue(driver.getTitle().contains("Online"));
    }

    @AfterMethod
    public void teardown() {
    	driverManager.quitDriver(driver);
    }
}
