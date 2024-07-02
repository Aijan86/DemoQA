package com.demoqa.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import static com.demoqa.utils.ConfigReader.getValue;


//Этот класс ChromeWebDriver предназначен для настройки и запуска веб-драйвера Chrome с использованием библиотеки Selenium.

public class ChromeWebDriver {
    public static WebDriver loadChromeDriver() {
        //Автоматически загружает и устанавливает правильную версию ChromeDrive
        WebDriverManager.chromedriver().setup();

        //Настройка ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");//Разрешает удаленные источники
        options.addArguments("--disable-extensions");//Отключает расширения Chrome
        options.addArguments("--window-size-1920,1080");//Устанавливает размер окна браузера
        options.addArguments("--no-sandbox");//Запускает Chrome без песочницы
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);//Устанавливает стратегию загрузки страницы

        if (Boolean.parseBoolean(getValue("headless"))){//Если в пропертис указан headless = true, то мы не будем видеть графическое отображение
            options.addArguments("--headless");
        }

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;




//для удаленного запуска через Sauce Labs

//        ChromeOptions browserOptions = new ChromeOptions();
//        browserOptions.setPlatformName("Windows 11");
//        browserOptions.setBrowserVersion("latest");
//        Map<String, Object> sauceOptions = new HashMap<>();
//        sauceOptions.put("username", "oauth-aijankydybaeva-8b176");
//        sauceOptions.put("accessKey", "aac2d046-db19-4831-bcdb-a70806db2e92");
//        sauceOptions.put("build", "<your build id>");
//        sauceOptions.put("name", "<your test name>");
//        browserOptions.setCapability("sauce:options", sauceOptions);
//
//        URL url = null;
//        try {
//            url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
//
//        if (Boolean.parseBoolean(getValue("headless"))) {
//            browserOptions.addArguments("--headless");
//        }
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        return driver;
    }


    }
