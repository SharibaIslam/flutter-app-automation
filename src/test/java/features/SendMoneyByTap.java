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

public class SendMoneyByTap extends BasePage {
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());
    WebElement ee1,ee2,ee3,asuc,msg;
    public static String txnId,toWallet,amount,asc,ascm,msg1;
    public SendMoneyByTap() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForSendMoneyTap)
    public static WebElement sendMoneyTap;

    @FindBy(xpath = Path.xPathForSendMoneyNext)
    public static WebElement nextButton;

    @FindBy(xpath = Path.xPathForSendMoneyConfirm)
    public static WebElement confirmButton;

    @FindBy(xpath = Path.xPathForSendMoneyOkbutton)
    public static WebElement successOkButton;

    @FindBy(xpath = Path.xPathForSendMoneyShowWallet)
    public static WebElement walletStore;

    @FindBy(xpath = Path.xPathForSendMoneyShowAmount)
    public static WebElement amountStore;

    @FindBy(xpath = Path.xPathForSendMoneyTXNID)
    public static WebElement txnIDStore;

    @FindBy(xpath = Path.xPathForSendMoneyTestCase)
    public static WebElement sendMoneyTestCase;

    @FindBy(xpath = Path.xPathForSendMoneyHomeButton)
    public static WebElement sendMoneyHomeButton;


    @Test(priority = 1)
    public void testMenuByTap() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(2000);
        sendMoneyTap.click();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void testNextButton() throws InterruptedException, IOException, URISyntaxException {
        nextButton.click();
        Thread.sleep(3000);
    }
    @Test(priority = 3)
    public void testConfirmButton() throws InterruptedException, IOException, URISyntaxException {
        confirmButton.click();
        Thread.sleep(3000);
        System.out.println("Context name is :" + Util.getCurrentContextHandle(driver));
        Thread.sleep(2000);

    }

    @Test(priority = 4)
    public void testSendMoneyOkButton() throws InterruptedException, IOException, URISyntaxException {
        try {
            if (successOkButton.isDisplayed()) {
                Thread.sleep(1000);
                ee1 = walletStore;
                toWallet = ee1.getText().toString();
                System.out.println(toWallet);
                Thread.sleep(1000);
                ee2 = amountStore;
                amount = ee2.getText().toString();
                System.out.println(amount);
                Thread.sleep(1000);
                ee3 = txnIDStore;
                txnId = ee3.getText().toString();
                System.out.println(txnId);
                Thread.sleep(1000);
                msg=sendMoneyTestCase;
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
