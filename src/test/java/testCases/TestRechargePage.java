package testCases;


import features.Recharge;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestRechargePage {
    Recharge recharge;
    Date time = new Date(System.currentTimeMillis());
    String ascm;
 @BeforeTest
    public void init() throws Exception{
     recharge=new Recharge();
 }


    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestLoginPage")
    public void testMenu() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(recharge.rechargeMenu.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        recharge.testRechargeMenuClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestLoginPage")
    public void testRechargeMobile() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(recharge.giveRechargeMobile.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        recharge.testRechargeMobSend();
    }
    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestLoginPage")
    public void testAmount() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(recharge.rechargeAmount.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        recharge.testAmount();
    }
    @Test(priority = 3,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestLoginPage")
    public void testNext() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(recharge.rechargeNext.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        recharge.testNextButton();
    }
    @Test(priority = 4,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestLoginPage")
    public void testConfirmButton() throws IOException, InterruptedException, URISyntaxException {
     Assert.assertTrue(recharge.rechargeConfirm.isDisplayed(), "Login test PASS");
     Thread.sleep(1000);
        recharge.testConfirmButton();

    }
    @Test(priority = 5,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestLoginPage")
    public void testRechargeOkButton() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue((recharge.rechargeOkButton.isDisplayed()), "Login test PASS");
        Thread.sleep(1000);
        recharge.testRechargeOkButton();
    }
    @Test(priority = 6,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestLoginPage")
    public void testCaseForPayment() throws Exception {
        // Verify login/test case
        try {
            ascm="Transaction successful.";

            if (recharge.msg1.equalsIgnoreCase(ascm)) {
                Allure.addDescription("Status: PASS \n\r Type: Recharge \n\r Date Time: " + (time.toString())+ "\n\r From Wallet: " + Util.readConfigData()[2]+ "\n\r To Mobile: " +recharge.mobile+ "\n\r Operator Name: " +recharge.operator+ "\n\r  Amount: " +recharge.amount+ "\n\r Type: " +recharge.type );
            }
        }catch (Exception e){
            recharge.home.click();
            Thread.sleep(1000);
            Assert.fail("Status: FAIL \n\r Type: Recharge \n\r Date Time: " + (time.toString()));
            Thread.sleep(1000);



        }
    }

}
