package testCases;


import features.SchoolPayment;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestSchoolPaymentPage {
    SchoolPayment schoolPayment;
    Date time = new Date(System.currentTimeMillis());
    String ascm,msg2;
 @BeforeTest
    public void init() throws Exception{
     schoolPayment=new SchoolPayment();
 }

    public TestSchoolPaymentPage() {
        super();
    }

    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testMenu() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(schoolPayment.paymentMenu.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        schoolPayment.testPaymentMenuClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testPayee() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(schoolPayment.payeeCode.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        schoolPayment.testPayeeSend();
    }
    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testFirstNext() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(schoolPayment.firstNext.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        schoolPayment.testNextClick();
    }
    @Test(priority = 3,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testStdId() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(schoolPayment.stdID.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        schoolPayment.testStdIdSend();
    }

    @Test(priority = 4,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testSecondNextButton() throws IOException, InterruptedException, URISyntaxException {

        Thread.sleep(1000);
        schoolPayment.testSecondNextButton();
    }
    @Test(priority = 5,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testSchoolNext() throws Exception {

        Thread.sleep(1000);
        schoolPayment.testSchoolNextButton();
        try{
            msg2="Invalid amount";
            String msg3=schoolPayment.paymentDueMsg.getText();
            if(msg3.equalsIgnoreCase(ascm)){
                Allure.addDescription("Status: PASS \n\r Type: School Payment \n\r Date Time: " + (time.toString())+ "\n\r From Wallet: " + Util.readConfigData()[2]);
            }

        }catch(Exception r) {
            Allure.addDescription("Status: PASS \n\r Type: School Payment \n\r Date Time: " + (time.toString())+ "\n\r From Wallet: " + Util.readConfigData()[2]);
        }
    }
    @Test(priority = 6,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testConfirmButton() throws IOException, InterruptedException, URISyntaxException {
     Assert.assertTrue(schoolPayment.confirmButton.isDisplayed(), "Login test PASS");
     Thread.sleep(1000);
        schoolPayment.testConfirmButton();

    }
    @Test(priority = 7,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testSchoolPaymentButton() throws IOException, InterruptedException, URISyntaxException {

        Thread.sleep(1000);
        schoolPayment.paymentOkButton();
    }
    @Test(priority = 8,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestLoginPage")
    public void testCaseForPayment() throws Exception {
        // Verify login/test case
        try {
            ascm="Transaction successful.";

            if (schoolPayment.msg1.equalsIgnoreCase(ascm)) {
                Allure.addDescription("Status: PASS \n\r Type: School Payment \n\r Date Time: " + (time.toString())+ "\n\r From Wallet: " + Util.readConfigData()[2]+ "\n\r To Payee: " + schoolPayment.payeeName+ "\n\r STD Name: " +schoolPayment.studentName+ "\n\r STD Id: " + schoolPayment.studentNumber+"\n\r To MerChantWallet: " +schoolPayment.MerchantWallet+ "\n\r Amount: " +schoolPayment.amount+ "\n\r Txn ID: " +schoolPayment.txnId );
            }
        }catch (Exception e){
            schoolPayment.paymentHomeButton.click();
            Thread.sleep(1000);
            Assert.fail("Status: FAIL \n\r Type: Payment \n\r Date Time: " + (time.toString()));

        }

    }

}
