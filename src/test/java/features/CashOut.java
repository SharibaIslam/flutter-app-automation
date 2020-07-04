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

public class CashOut extends BasePage {
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());
    WebElement ee1,ee2,ee3,asuc,msg,ee4;
    public String txnId,agentwallet,MerchantWallet,amount,asc,ascm,msg1;

    public CashOut() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForCashOutMenuHit)
    public static WebElement cashOutMenu;

    @FindBy(xpath = Path.xPathForCashOutAgentWallet)
    public static WebElement cashOutAgentWallet;

    @FindBy(xpath = Path.xPathForCashOutAmount)
    public static WebElement cashOutAmount;

    @FindBy(xpath = Path.xPathForCashOutNext)
    public static WebElement cashOutNext;

    @FindBy(xpath = Path.xPathForCashOutConfirm)
    public static WebElement confirm;

    @FindBy(xpath = Path.xPathForCashOutOkButton)
    public static WebElement successOkButton;

    @FindBy(xpath = Path.xPathForCashOutGetAgentWallet)
    public static WebElement storeAgentWallet;

    @FindBy(xpath = Path.xPathForCashOutGetAmount)
    public static WebElement storeAmount;

    @FindBy(xpath = Path.xPathForCashOutGetTxnID)
    public static WebElement storeTxnId;

    @FindBy(xpath = Path.xPathForCashOutSuccessPage)
    public static WebElement successPage;


    @FindBy(xpath = Path.xPathForCashOutHome)
    public static WebElement cashOutHome;


    @Test(priority = 0)
    public void testCashOutClick() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(2000);
        cashOutMenu.click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void testAgentWalletSend() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(1000);
        cashOutAgentWallet.clear();
        Thread.sleep(2000);
        cashOutAgentWallet.sendKeys(Util.readConfigData()[10]);
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void testAmountSend() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(1000);
        cashOutAmount.clear();
        Thread.sleep(2000);
        cashOutAmount.sendKeys(Util.readConfigData()[5]);
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void testNextButton() throws InterruptedException, IOException, URISyntaxException {
        cashOutNext.click();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void testConfirmButton() throws InterruptedException, IOException, URISyntaxException {
        confirm.click();
        Thread.sleep(2000);
        System.out.println("Context name is :" + Util.getCurrentContextHandle(driver));
        Thread.sleep(2000);

    }
    @Test(priority = 5)
    public void cashOutOkButton() throws InterruptedException, IOException, URISyntaxException {
        try {
            if (successOkButton.isDisplayed()) {
                Thread.sleep(1000);
                ee1 =storeAgentWallet;
                agentwallet = ee1.getText().toString();
                System.out.println(agentwallet);
                Thread.sleep(1000);
                ee3 = storeAmount;
                amount = ee3.getText().toString();
                System.out.println(amount);
                Thread.sleep(1000);
                ee4 = storeTxnId;
                txnId = ee4.getText().toString();
                System.out.println(txnId);
                Thread.sleep(1000);
                msg=successPage;;
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
