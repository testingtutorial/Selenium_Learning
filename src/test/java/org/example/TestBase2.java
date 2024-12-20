package org.example;

import org.testng.annotations.Test;

public class TestBase2 {

    @Test(priority = 1, groups = {"smoke"})
    public void efg()
    {
        System.out.println("efg");
        //Assert.assertEquals(0,1);
    }

    @Test(priority = 2, dependsOnMethods = "efg", alwaysRun = true)
    public void abc()
    {
        System.out.println("abc");
    }

    @Test(priority = 3, invocationCount = 5)
    public void cde()
    {
        System.out.println("cde");
    }

    @Test(priority = 4, timeOut = 10000)
    public void bcd()
    {
        System.out.println("bcd");
    }
}
