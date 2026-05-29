package com.framework.core.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverManager {
    private WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
        	Logger.getLogger("org.openqa.selenium")
             .setLevel(Level.OFF);
        	Logger.getLogger("org.openqa.selenium.devtools")
            .setLevel(Level.OFF);
        	Logger.getLogger("org.openqa.selenium.chromium")
            .setLevel(Level.OFF);
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
