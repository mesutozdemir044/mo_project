package com.symund.utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory { public static WebDriver getDriver(String browserType){
    if(browserType.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }else if(browserType.equalsIgnoreCase("firefox")){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }else{
        System.out.println("not supported else browserType");
        return null;
    }

}
}
