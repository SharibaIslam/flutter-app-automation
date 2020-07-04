package testCases;


import features.CashOut;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestCashOutPage {
    CashOut cashOut;
    Date time = new Date(System.currentTimeMillis());
    String ascm;
 @BeforeTest
    public void init() throws Exception{
     cashOut=new CashOut();
 }

    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "TestCashOutPage", dependsOnGroups = "TestLoginPage")
    public void testMenu() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(cashOut.cashOutMenu.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        cashOut.testCashOutClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "TestCashOutPage", dependsOnGroups = "TestLoginPage")
    public void testAgentWallet() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(cashOut.cashOutAgentWallet.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        cashOut.testAgentWalletSend();
    }
    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "TestCashOutPage", dependsOnGroups = "TestLoginPage")
    public void testAmount() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(cashOut.cashOutAmount.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        cashOut.testAmountSend();
    }
    @Test(priority = 3,alwaysRun = true, enabled = true, groups = "TestCashOutPage", dependsOnGroups = "TestLoginPage")
    public void testNext() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(cashOut.cashOutNext.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        cashOut.testNextButton();
    }

    @Test(priority = 4,alwaysRun = true, enabled = true, groups = "TestCashOutPage", dependsOnGroups = "TestLoginPage")
    public void testConfirmButton() throws IOException, InterruptedException, URISyntaxException {
     Assert.assertTrue(cashOut.confirm.isDisplayed(), "Login test PASS");
     Thread.sleep(1000);
        cashOut.testConfirmButton();

    }
    @Test(priority = 5,alwaysRun = true, enabled = true, groups = "TestCashOutPage", dependsOnGroups = "TestLoginPage")
    public void testCashOutOkButton() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue((cashOut.successOkButton.isDisplayed()), "Login test PASS");
        Thread.sleep(1000);
        cashOut.cashOutOkButton();
    }
    @Test(priority = 6,alwaysRun = true, enabled = true, groups = "TestCashOutPage", dependsOnGroups = "TestLoginPage")
    public void testCaseForCashOut() throws Exception {
        // Verify login/test case
        try {
            ascm="Transaction successful.";

            if (cashOut.msg1.equalsIgnoreCase(ascm)) {
                Allure.addDescription("Status: PASS \n\r Type: Cash-Out \n\r Date Time: " + (time.toString())+ "\n\r From Wallet: " + Util.readConfigData()[2]+ "\n\r To Payee: " + Util.readConfigData()[7]+ "\n\r To MerChantWallet: " +cashOut.MerchantWallet+ "\n\r Amount: " +cashOut.amount+ "\n\r Txn ID: " +cashOut.txnId );
            }
        }catch (Exception e){
            cashOut.cashOutHome.click();
            Thread.sleep(1000);
            Assert.fail("Status: FAIL \n\r Type: Cash-Out \n\r Date Time: " + (time.toString()));
        }
    }

}
