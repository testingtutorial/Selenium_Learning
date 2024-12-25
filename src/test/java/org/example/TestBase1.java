package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBase1 {

    @Test(priority = 1)
    public void efg()
    {
        System.out.println("efg");
        //Assert.assertEquals(0,1);
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(0,0);
        System.out.println("Printing after Assertion");
        System.out.println("Soft Assertion");
    }

    @Test(priority = 2, dependsOnMethods = "efg", alwaysRun = true)
    public void abc()
    {
        System.out.println("abc");
        Assert.assertFalse(1==1);
        System.out.println("Printing after Assert False");
        System.out.println("Hard Assertion");
    }

    @Test(priority = 3)
    public void cde()
    {
        System.out.println("cde");
    }

    @Test(priority = 4)
    public void bcd()
    {
        System.out.println("bcd");
    }
}
