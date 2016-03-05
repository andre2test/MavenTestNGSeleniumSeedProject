package com.selvi.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AppTest {

    private WebDriver driver;

    @BeforeTest
    public void setupSelenium(){
        driver = new FirefoxDriver();
    }

    @Test
    public void testSearch(){
        driver.get("http://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Assert.assertEquals(driver.getTitle(), "Google");
    }

    @AfterTest
    public void closeSelenium(){
        driver.quit();
    }
}