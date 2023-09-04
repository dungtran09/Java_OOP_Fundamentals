    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dungtran.selenium.guru99test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author vihlih-qt
 */
public class Guru99Test {
    
    private static WebDriver myBrowser;
    private static String driverPath = "chromedriver";
    
    @BeforeAll
    public static void setUpClass() {
        System.getProperty("webdriver.chrome.driver", driverPath);
        myBrowser = new ChromeDriver();
        
        myBrowser.manage().window().minimize();
    }
    
    
    @Test
    public void testLoginGivenRightAccountSayHiUserName() throws InterruptedException {
        myBrowser.get("https://demo.guru99.com/V4/");
        Thread.sleep(4000);
    }
    
    @AfterAll
    public static void tearDownClass() {
        myBrowser.quit();
    }
    
}
