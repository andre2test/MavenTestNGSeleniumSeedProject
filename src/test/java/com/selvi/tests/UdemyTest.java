package com.selvi.tests;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UdemyTest
{
    @BeforeSuite
    public void BeforeSuiteSetup(){
        System.out.print("\n ***** BEFORE TEST SUITE   *****\n");
    }

    @AfterSuite
    public void AfterSuiteSetup(){
        System.out.print("\n ***** AFTER TEST SUITE  *****\n");
    }

    @Parameters({"URL"})
    @Test
    public void TC01_WebLoginCarLoan(String urlname){
        System.out.print("TC01_WebLoginCarLoan\n");
        System.out.printf("Navigating to URL: %s\n", urlname);
        Assert.assertTrue(true);
    }

    @Test(groups={"Smoke"})
    public void TC02_MobileLoginCarLoan(){
        System.out.print("TC02_MobileLoginCarLoan\n");
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    public void TC03_ApiLoginCarLoan(){
        System.out.print(" TC03_ApiLoginCarLoan\n");
        Assert.assertTrue(true);
    }
}
