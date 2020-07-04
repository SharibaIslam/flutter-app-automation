package features;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import launch.BasePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import util.Path;
import util.Util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.HashMap;

public class SchoolPayment extends BasePage {
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());
    WebElement ee1,ee2,ee3,asuc,msg,ee4,ee5,ee6;
    String str = "NEXT";
    public String txnId,payeeName,MerchantWallet,amount,asc,ascm,msg1,studentNumber,studentName;

    public SchoolPayment() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForPaymentMenuHit)
    public static WebElement paymentMenu;

    @FindBy(xpath = Path.xPathForPaymentPayeesch)
    public static WebElement payeeCode;

    @FindBy(xpath = Path.xPathForPaymentNextsch)
    public static WebElement firstNext;

    @FindBy(xpath = Path.xPathForEnterStdID)
    public static WebElement stdID;

    @FindBy(xpath = Path.xPathForSchoolNext)
    public static WebElement secondNext;

    @FindBy(xpath = Path.xPathForSchoolNxt)
    public static WebElement schoolNext;

    @FindBy(xpath = Path.xPathForSchoolConfirm)
    public static WebElement confirmButton;

    @FindBy(xpath = Path.xPathForSchoolOkButton)
    public static WebElement successOkButton;

    @FindBy(xpath = Path.xPathForSchoolSTDPayee)
    public static WebElement PayeeStore;

    @FindBy(xpath = Path.xPathForSchoolSTDWallet)
    public static WebElement merchantWalletStore;

    @FindBy(xpath = Path.xPathForSchoolSTDNumber)
    public static WebElement storeStdNumber;

    @FindBy(xpath = Path.xPathForSchoolSTDName)
    public static WebElement storeStdName;


    @FindBy(xpath = Path.xPathForSchoolSTDAmt)
    public static WebElement merchantAmountStore;

    @FindBy(xpath = Path.xPathForSchoolSTDTxnID)
    public static WebElement storeTxnID;

    @FindBy(xpath = Path.xPathForSchoolPaymentsuccessMsg)
    public static WebElement successMsg;


    @FindBy(xpath = Path.xPathForPaymentHomeButton)
    public static WebElement paymentHomeButton;

    @FindBy(xpath = Path.xPathForSchoolPaymentDueMsg)
    public static WebElement paymentDueMsg;


    @Test(priority = 0)
    public void testPaymentMenuClick() throws InterruptedException, IOException, URISyntaxException {

        paymentMenu.click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void testPayeeSend() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(1000);
        payeeCode.clear();
        Thread.sleep(2000);
        payeeCode.sendKeys(Util.readConfigData()[9]);
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void testNextClick() throws InterruptedException, IOException, URISyntaxException {
        firstNext.click();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void testStdIdSend() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(1000);
        stdID.clear();
        Thread.sleep(2000);
        stdID.sendKeys(Util.readConfigData()[8]);
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void testSecondNextButton() throws InterruptedException, IOException, URISyntaxException {
        secondNext.click();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void testSchoolNextButton() throws Exception {
        Thread.sleep(4000);
        Util.scroll();
       //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ str + "\").instance(0))");
        Thread.sleep(5000);
        schoolNext.click();
        Thread.sleep(4000);
    }
    @Test(priority = 6)
    public void testConfirmButton() throws InterruptedException, IOException, URISyntaxException {
        confirmButton.click();
        Thread.sleep(2000);
        System.out.println("Context name is :" + Util.getCurrentContextHandle(driver));
        Thread.sleep(2000);

    }
    @Test(priority = 7)
    public void paymentOkButton() throws InterruptedException, IOException, URISyntaxException {
        try {
            if (successOkButton.isDisplayed()) {
                Thread.sleep(1000);
                ee1=PayeeStore;
                payeeName=ee1.getText().toString();
                Thread.sleep(1000);
                ee2 = merchantWalletStore;
                MerchantWallet = ee2.getText().toString();
                System.out.println(MerchantWallet);
                Thread.sleep(1000);
                ee5 = storeStdNumber;
                studentNumber = ee2.getText().toString();
                System.out.println(studentNumber);
                Thread.sleep(1000);
                ee6 = storeStdName;
                studentName = ee2.getText().toString();
                System.out.println(studentName);
                Thread.sleep(1000);
                ee3 = merchantAmountStore;
                amount = ee3.getText().toString();
                System.out.println(amount);
                Thread.sleep(1000);
                ee4 = storeTxnID;
                txnId = ee4.getText().toString();
                System.out.println(txnId);
                Thread.sleep(1000);
                msg=successMsg;;
                msg1=msg.getText().toString();
                System.out.println(msg1);
                Thread.sleep(3000);
                successOkButton.click();
                Thread.sleep(2000);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }


}
