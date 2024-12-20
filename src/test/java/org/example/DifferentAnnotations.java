package org.example;
import org.testng.annotations.*;

public class DifferentAnnotations {

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }

    @Test
    public void test1()
    {
        System.out.println("test1");
    }

    @Test
    public void test2()
    {
        System.out.println("test2");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method");
    }

    @AfterClass
    public void AfterMethod()
    {
        System.out.println("After Class");
    }

    @AfterTest
    public void AfterTest()
    {
        System.out.println("After Test");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }

    @AfterSuite
    public void AfterSuite()
    {
        System.out.println("After Suite");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before Suite");
    }
}
