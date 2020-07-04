package features;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import launch.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import util.Path;
import util.Util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class Payment extends BasePage {
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());
    WebElement ee1,ee2,ee3,asuc,msg,ee4;
    public String txnId,payee,MerchantWallet,amount,asc,ascm,msg1;

    public Payment() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForPaymentMenuHit)
    public static WebElement paymentMenu;

    @FindBy(xpath = Path.xPathForPaymentPayee)
    public static WebElement payeeCode;

    @FindBy(xpath = Path.xPathForPaymentNext)
    public static WebElement firstNext;

    @FindBy(xpath = Path.xPathForPaymentAmount)
    public static WebElement giveAmount;

    @FindBy(xpath = Path.xPathForNextButton)
    public static WebElement secondNext;

    @FindBy(xpath = Path.xPathForPaymentConfirmButton)
    public static WebElement confirmButton;

    @FindBy(xpath = Path.xPathForOKButtonClick)
    public static WebElement successOkButton;

    @FindBy(xpath = Path.xPathPaymentCheckAddFavPayee)
    public static WebElement checkpayee;

   @FindBy(xpath = Path.xPathPaymentAddFavPayeeName)
    public static WebElement addFavPayee;

   @FindBy(xpath = Path.xPathForSuccessPayee)
    public static WebElement addedPayeeStore;

    @FindBy(xpath = Path.xPathForSuccessMerchantWallet)
    public static WebElement merchantWalletStore;

    @FindBy(xpath = Path.xPathForSuccessMerchantAmount)
    public static WebElement merchantAmountStore;

    @FindBy(xpath = Path.xPathForSuccessTXNID)
    public static WebElement storeTxnID;

    @FindBy(xpath = Path.xPathForSuccessMessage)
    public static WebElement successMsg;

    @FindBy(xpath = Path.xPathForOKButtonAfterAddedPayee)
    public static WebElement okButtonAfterAddedFavPayee;

    @FindBy(xpath = Path.xPathForPaymentHomeButton)
    public static WebElement paymentHomeButton;


    @Test(priority = 0)
    public void testPaymentMenuClick() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(2000);
        paymentMenu.click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void testPayeeSend() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(1000);
        payeeCode.clear();
        Thread.sleep(2000);
        payeeCode.sendKeys(Util.readConfigData()[7]);
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void testNextClick() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(2000);
        firstNext.click();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void testAmountSend() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(1000);
        giveAmount.clear();
        Thread.sleep(2000);
        giveAmount.sendKeys(Util.readConfigData()[5]);
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void testSecondNextButton() throws InterruptedException, IOException, URISyntaxException {
        secondNext.click();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void testConfirmButton() throws InterruptedException, IOException, URISyntaxException {
        confirmButton.click();
        Thread.sleep(2000);
        System.out.println("Context name is :" + Util.getCurrentContextHandle(driver));
        Thread.sleep(2000);

    }
    @Test(priority = 6)
    public void paymentOkButton() throws InterruptedException, IOException, URISyntaxException {
        try {
            if (successOkButton.isDisplayed()) {
                Thread.sleep(1000);
                checkpayee.click();
                Thread.sleep(3000);
                addFavPayee.clear();
                Thread.sleep(3000);
                addFavPayee.sendKeys(Util.readConfigData()[13]);
                Thread.sleep(3000);
                ee1 = addedPayeeStore;
                payee = ee1.getText().toString();
                System.out.println(payee);
                Thread.sleep(1000);
                ee2 = merchantWalletStore;
                MerchantWallet = ee2.getText().toString();
                System.out.println(MerchantWallet);
                Thread.sleep(1000);
                ee3 = merchantAmountStore;
                amount = ee3.getText().toString();
                System.out.println(amount);
                Thread.sleep(1000);
                /*ee4 = storeTxnID;
                txnId = ee4.getText().toString();
                System.out.println(txnId);
                Thread.sleep(1000);*/
                msg=successMsg;
                msg1=msg.getText().toString();
                System.out.println(msg1);
                Thread.sleep(3000);
                okButtonAfterAddedFavPayee.click();
                Thread.sleep(2000);
                successOkButton.click();
                Thread.sleep(2000);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }


}
