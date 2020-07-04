package testCases;


import features.LogIn;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestLoginPage {
    LogIn logIn;
    Date time = new Date(System.currentTimeMillis());
 @BeforeTest
    public void init() throws Exception{
     logIn=new LogIn();
 }


    @Test(priority = 1,alwaysRun = true, groups = "TestLoginPage")
    public void testLogIn() throws IOException, InterruptedException, URISyntaxException {

        logIn.testLogin();
    }
    @Test(priority = 2,alwaysRun = true, groups = "TestLoginPage")
    public void testLogInButton() throws IOException, InterruptedException, URISyntaxException {
        logIn.testLoginButton();
    }
   @Test(priority = 3,alwaysRun = true, groups = "TestLoginPage")
    public void testCase() throws Exception {
        try {
            if (logIn.deviceRegPrompt.isDisplayed()){
                String m=logIn.deviceRegPrompt.getText();
                System.out.println(m);
                Allure.addDescription("Status: PASS \n\r Type: Login As Customer \n\r Date Time: " + (time.toString()) + "\n\r Login Wallet: " + Util.readConfigData()[2]);
            }

        }catch (Exception e){
            try {
                if(logIn.dashboard.isDisplayed()){
                    String m=logIn.dashboard.getText();
                    System.out.println(m);
                    Allure.addDescription("Status: PASS \n\r Type: Login As Customer \n\r Date Time: " + (time.toString()) + "\n\r Login Wallet: " + Util.readConfigData()[2]);
                }
            }catch (Exception f){
                Assert.fail("Status: FAIL \n\r Type: Login As Customer \n\r Date Time: " + (time.toString()));
            }
        }
    }
}
