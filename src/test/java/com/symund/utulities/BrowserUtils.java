package com.symund.utulities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class BrowserUtils {
    public static void sleep(int second) throws InterruptedException {
    second *= 1000;
    try {
        Thread.sleep(second);
    } catch (InterruptedException e) {
    }
}


    public static void swithcWindosverify(WebDriver driver, String expectUrl, String expected) {

        String mainhandle = driver.getWindowHandle();
        Set<String> handle = driver.getWindowHandles();
        for (String each : handle) {
            driver.switchTo().window(each);
            System.out.println(driver.getCurrentUrl());
            if(driver.getCurrentUrl().equals(expectUrl)){
                break;
            }
        }
        String actual= driver.getTitle();
        System.out.println(actual);

        Assert.assertTrue(actual.equals(expected));
        System.out.println(expected);
    }

    public static void clicRadioButton(List<WebElement>radioButtons,String expectedcard){
        List<WebElement> Cardtypes= radioButtons;
        for (WebElement each : Cardtypes) {
            if(each.getAttribute("value").equalsIgnoreCase(expectedcard)){
                each.click();
            }
        }


    }

}
