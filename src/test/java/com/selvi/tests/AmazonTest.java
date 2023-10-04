package com.selvi.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AmazonTest {

    private WebDriver driver;

    @BeforeTest
    public void setupSelenium()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void TC01_testAmazonSearch(){
        driver.get("http://www.amazon.com");
		Assert.assertTrue(driver.getTitle().contains("Amazon"));
    }

    @AfterTest
    public void closeSelenium(){
        driver.quit();
    }
}