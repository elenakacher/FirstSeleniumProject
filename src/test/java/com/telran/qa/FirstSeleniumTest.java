package com.telran.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstSeleniumTest {

    WebDriver driver;

    //before - setUp - открывающий метод
    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        //    driver = new ChromeDriver();
        //    driver.get("https://www.google.de");
        driver.navigate().to("https://www.google.de");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // Test
    @Test
    public void openGoogleTest() {
        System.out.println("Site opened!");
    }

    @Test
    public void navigateTest() {
        //go back
        driver.navigate().back();
        //go forward
        driver.navigate().forward();
        //refresh the page
        driver.navigate().refresh();
        System.out.println("Site refresh!");
    }

    // after - tearDown - закрывающий метод

    @AfterMethod(enabled = false)
    public void tearDown() {
        // all tabs
        driver.quit();

        //one tab
        //driver.close();
    }
}
