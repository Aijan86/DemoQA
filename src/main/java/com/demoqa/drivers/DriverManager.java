package com.demoqa.drivers;

import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

// Класс DriverManager отвечает за управление экземпляром веб-драйвера (WebDriver).
// Он использует паттерн Singleton для обеспечения того, что только один экземпляр драйвера используется в течение выполнения тестов.
// Этот класс также позволяет закрывать драйвер корректно.
public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver==null) {
            switch (ConfigReader.getValue("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;

                default:
                    throw new IllegalArgumentException("You provided wrong Driver name");
            }
        }
        return driver;
    }


    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver=null;
            }
        } catch (Exception e) {
            System.err.println("Error while closing driver");
        }
    }

}
