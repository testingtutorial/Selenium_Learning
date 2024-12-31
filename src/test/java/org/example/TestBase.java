package org.example;
import org.base.Base;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestBase{


    @Test(priority = 1, enabled = false)
    public void efg()
    {
        System.out.println("efg");
    }

    @Test(priority = -1, enabled = false)
    public void abc()
    {
        System.out.println("abc");
    }

    @Test(priority = -1)
    public void cde()
    {
        System.out.println("cde");
    }

    @Test(priority = -3)
    public void bcd()
    {
        System.out.println("bcd");
        Assert.assertEquals(0,1);
    }

}
