package testCases;


import features.Payment;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestPaymentPage {
    Payment payment;
    Date time = new Date(System.currentTimeMillis());
    String ascm;
 @BeforeTest
    public void init() throws Exception{
     payment=new Payment();
 }

    public TestPaymentPage() {
        super();
    }

    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "TestPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testMenu() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(payment.paymentMenu.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        payment.testPaymentMenuClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "TestPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testPayee() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(payment.payeeCode.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        payment.testPayeeSend();
    }
    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "TestPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testFirstNext() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(payment.firstNext.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        payment.testNextClick();
    }
    @Test(priority = 3,alwaysRun = true, enabled = true, groups = "TestPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testAmount() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(payment.giveAmount.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        payment.testAmountSend();
    }
    @Test(priority = 4,alwaysRun = true, enabled = true, groups = "TestPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testSecondNextButton() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(payment.secondNext.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        payment.testSecondNextButton();
    }
    @Test(priority = 5,alwaysRun = true, enabled = true, groups = "TestPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testConfirmButton() throws IOException, InterruptedException, URISyntaxException {
     //Assert.assertTrue(payment.confirmButton.isDisplayed(), "Login test PASS");
     Thread.sleep(1000);
        payment.testConfirmButton();

    }
    @Test(priority = 6,alwaysRun = true, enabled = true, groups = "TestPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testSendMoneyOkButton() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue((payment.successOkButton.isDisplayed()), "Login test PASS");
        Thread.sleep(1000);
        payment.paymentOkButton();
    }
    @Test(priority = 7,alwaysRun = true, enabled = true, groups = "TestPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testCaseForPayment() throws Exception {
        // Verify login/test case
        try {
            ascm="Transaction successful.";

            if (payment.msg1.equalsIgnoreCase(ascm)) {
                Allure.addDescription("Status: PASS \n\r Type: Payment \n\r Date Time: " + (time.toString())+ "\n\r From Wallet: " + Util.readConfigData()[2]+ "\n\r To Payee: " + Util.readConfigData()[7]+ "\n\r To MerChantWallet: " +payment.MerchantWallet+ "\n\r Amount: " +payment.amount+ "\n\r Txn ID: " +payment.txnId );
            }
        }catch (Exception e){
            payment.paymentHomeButton.click();
            Thread.sleep(1000);
            Assert.fail("Status: FAIL \n\r Type: Payment \n\r Date Time: " + (time.toString()));
        }
    }

}
