package com.autoPractice.project.shared;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.autoPractice.project.shared.MainRunner.getProperties;

public class WebDriverHandling {

    public static WebDriver driver = null;


    public WebDriver getDriverInstance(String driver_choose)    {
        System.setProperty("webdriver.chrome.driver", "E:\\Transformation\\Softwares\\chromedriver.exe");
        driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return driver;
    }

    public void closeDriver()
    {
        driver.close();
        driver.quit();
    }

    public String getDriverName()
    {
        if (getProperties().get(0) == null) {
            return "ff";
        }
        return getProperties().get(0).toString();
    }


    public void navigate()
    {
        System.out.println("hello");
        String url = getProperties().get(1).toString();
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("Navigate to " + url);

    }

}
