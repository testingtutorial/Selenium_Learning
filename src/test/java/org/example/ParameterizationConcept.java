package org.example;
import org.base.Base;
import org.testng.annotations.*;

public class ParameterizationConcept{

    @Test(priority = 1)
    @Parameters({"a","b"})
    public void efg(int first, int second)
    {
        int total = first + second;
        System.out.println(total);
        System.out.println("efg");
        //Assert.assertEquals(0,1);
    }

    @Test(priority = 2)
    @Parameters({"course"})
    public void abc(String cou)
    {
        System.out.println("I am learning "+cou);
    }
}
