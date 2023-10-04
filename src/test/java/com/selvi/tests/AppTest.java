package com.selvi.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AppTest {

    private WebDriver driver;

    @BeforeTest
    public void setupSelenium()
    {
        driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void TC01_TestSearch(){
        driver.get("http://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
    }

    @Test
    public void TC02_TestNFL(){
        driver.get("http://www.nfl.com");
        Assert.assertTrue(driver.getTitle().contains( "NFL.com"));
    }

    @AfterTest
    public void closeSelenium(){
        driver.quit();
    }
}