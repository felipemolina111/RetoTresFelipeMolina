package com.falabella.Utils;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ShadowHandler  {

    public static void openShadow(WebDriver driver) throws InterruptedException {

        //Thread.sleep(5000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement noOption = (WebElement) jse.executeScript("return document.querySelector('div.airship-html-prompt-shadow').shadowRoot.querySelector('div > div > div.airship-alert-buttons > button.airship-btn.airship-btn-deny')");
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", noOption);
    }


}