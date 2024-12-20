package org.example;

import org.testng.annotations.Test;

public class GroupingConceptTestNG {

    @Test(groups = {"smoke"})
    public void efg()
    {
        System.out.println("efg");
    }

    @Test(groups = {"smoke"})
    public void abc()
    {
        System.out.println("abc");
    }

    @Test()
    public void cde()
    {
        System.out.println("cde");
    }

    @Test()
    public void bcd()
    {
        System.out.println("bcd");
    }
}
