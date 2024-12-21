package org.example;
import org.testng.annotations.*;

public class DataProviderConcept {

    @DataProvider
    public static Object[][] getData() {

      Object [][] testdata = new Object[2][2];
      testdata[0][0] = "username1";
      testdata[0][1] = "password1";
      testdata[1][0] = "username2";
      testdata[1][1] = "password2";

      return testdata;
    }

    @Test(dataProvider = "getData")
    public void login(String username, String password)
    {
        System.out.println(username);
        System.out.println(password);
    }


}
