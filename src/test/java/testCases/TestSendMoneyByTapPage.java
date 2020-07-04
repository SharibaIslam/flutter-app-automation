package testCases;


import features.SendMoneyByTap;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestSendMoneyByTapPage {
    SendMoneyByTap sendMoneyByTap;
    Date time = new Date(System.currentTimeMillis());
    String ascm;
 @BeforeTest
    public void init() throws Exception{
     sendMoneyByTap=new SendMoneyByTap();
 }
    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "SendMoneyByTap", dependsOnGroups = "SendMoney")
    public void testMenuByTap() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(sendMoneyByTap.sendMoneyTap.isDisplayed(), "Login test PASS");
        Thread.sleep(4000);
        sendMoneyByTap.testMenuByTap();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "SendMoneyByTap", dependsOnGroups = "SendMoney")
    public void testNextButton() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(sendMoneyByTap.nextButton.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        sendMoneyByTap.testNextButton();
    }
    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "SendMoneyByTap", dependsOnGroups = "SendMoney")
    public void testConfirmButton() throws IOException, InterruptedException, URISyntaxException {
     Assert.assertTrue(sendMoneyByTap.confirmButton.isDisplayed(), "Login test PASS");
     Thread.sleep(1000);
     sendMoneyByTap.testConfirmButton();

    }
    @Test(priority = 3,alwaysRun = true, enabled = true, groups = "SendMoneyByTap", dependsOnGroups = "SendMoney")
    public void testSendMoneyOkButton() throws IOException, InterruptedException, URISyntaxException {

        //Assert.assertTrue((sendMoneyByTap.successOkButton.isDisplayed()), "Login test PASS");
        Thread.sleep(1000);
        sendMoneyByTap.testSendMoneyOkButton();
    }
    @Test(priority = 4,alwaysRun = true, enabled = true, groups = "SendMoneyByTap", dependsOnGroups = "SendMoney")
    public void testCaseForSendMoney() throws Exception {
        // Verify login/test case
        try {
            ascm="Transaction successful.";

            if (sendMoneyByTap.msg1.equalsIgnoreCase(ascm)) {
                Allure.addDescription("Status: PASS \n\r Type: Send Money By Tap \n\r Date Time: " + (time.toString())+ "\n\r From Wallet: " + Util.readConfigData()[2]+ "\n\r To Wallet: " +sendMoneyByTap.toWallet+  "\n\r Amount: " +sendMoneyByTap.amount+ "\n\r Txn ID: " +sendMoneyByTap.txnId );
            }
        }catch (Exception e){
            sendMoneyByTap.sendMoneyHomeButton.click();
            Thread.sleep(2000);
            Assert.fail("Status: FAIL \n\r Type: Send Money \n\r Date Time: " + (time.toString()));
        }
    }

}
