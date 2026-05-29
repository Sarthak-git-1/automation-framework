package com.framework.core.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    private static WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized"); // optional
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public void quitDriver(WebDriver driver) {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
