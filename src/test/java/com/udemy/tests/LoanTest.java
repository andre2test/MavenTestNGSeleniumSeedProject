package com.udemy.tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoanTest {

    @BeforeTest
    public void GettingStarted(){
        System.out.print("\n ***** BEFORE TEST **** \n");

    }
    @BeforeClass
    public void BeforeClassTest(){
        System.out.print("\n ***** BEFORE CLASS  **** \n");
    }

    @AfterClass
    public void AfterClassTest(){
        System.out.print("\n ***** AFTER CLASS  **** \n");
    }

    @BeforeMethod
    public void BeforeMethodTest(){
        System.out.print("\n ***** BEFORE METHOD MAN **** \n");
    }
    @AfterTest
    public void EndingNow(){
        System.out.print("\n ***** AFTER TEST ***** \n");
        Assert.assertTrue(true);
    }

    @Parameters({"URL","APIkey"})
    @Test(dependsOnMethods={"TC03_ApiLoginLoan"})
    public void TC01_WebLoginLoan(String urlname, String apiKey){
        System.out.print("TC01_WebLoginLoan\n");
        System.out.printf("Navigating to URL: %s", urlname);
        System.out.printf("API Key: %s", apiKey);
        Assert.assertTrue(true);
    }

    @Test(groups={"Smoke"})
    public void TC02_MobileLoginLoan(){
        System.out.print("TC02_MobileLoginLoan\n");
        Assert.assertTrue(true);
    }

    @Test(timeOut = 30000)
    public void TC03_ApiLoginLoan(){
        System.out.print("TC03_ApiLoginLoan\n");
        Assert.assertTrue(true);
    }

    @Test(dataProvider = "getData")
    public void TC04_InPersonLoginLoan(String usr, String pass){
        System.out.print("TC04_InPersonLoginLoan\n");
        System.out.printf("User %s, Password %s", usr, pass);
        Assert.assertTrue(true);
    }

    @DataProvider
    public Object[][] getData()
    {
        // 1st Combo username password - normal
        Object[][] data = new Object[3][2];
        data[0][0] = "mojoJojo";
        data[0][1]= "ew87e7";

        // 2nd Combo username password - no cred hist
        data[1][0] = "kabron";
        data[1][1] = "3298ekwk";

        // 3td Combo username password - bad credit
        data[2][0] = "huevon";
        data[2][1] = "akdu246d";

        return data;
    }
}
