/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.dungtran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author vihlih-qt
 */
public class SeleniumTwoGo {

    public static void main(String[] args) throws InterruptedException {

        searchGoogle();
        // searchGoogleV2();

    }

    public static void searchGoogleV2() {
        WebDriver myBrowser;

        String driverPath = "chromedriver";

        System.setProperty("webdriver.chrome", driverPath);
        myBrowser = new ChromeDriver();

        myBrowser.get("https//google.com");

        myBrowser.manage().window().maximize();

    }

    public static void searchGoogle() throws InterruptedException {
        WebDriver myBrowser;

        String driverPath = "chromedriver";

        System.setProperty("webdriver.chrome", driverPath);

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--inconito");

        myBrowser = new ChromeDriver(opt);

        myBrowser.get("https://google.com");

        myBrowser.manage().window().maximize();
        
        WebElement searchBox = myBrowser.findElement(By.name("q"));
        searchBox.sendKeys("Install Nvim and config on linux");
        searchBox.submit();
        
        Thread.sleep(5000);
        myBrowser.quit();
        

    }

}
