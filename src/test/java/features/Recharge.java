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

public class Recharge extends BasePage {
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());
    WebElement ee1,ee2,ee3,asuc,msg,ee4;
    public String operator,type,mobile,agentwallet,MerchantWallet,amount,asc,ascm,msg1;

    public Recharge() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForRechargeMenuHit)
    public static WebElement rechargeMenu;

    @FindBy(xpath = Path.xPathForRechargeMobile)
    public static WebElement giveRechargeMobile;

    @FindBy(xpath = Path.xPathForRechargeAmount)
    public static WebElement rechargeAmount;

    @FindBy(xpath = Path.xPathForRechargeNext)
    public static WebElement rechargeNext;

    @FindBy(xpath = Path.xPathForRechargeConfirm)
    public static WebElement rechargeConfirm;

    @FindBy(xpath = Path.xPathForRechargeOkbutton)
    public static WebElement rechargeOkButton;

    @FindBy(xpath = Path.xPathForRechargemobshow)
    public static WebElement storeMobile;

    @FindBy(xpath = Path.xPathForRechargeAmountshow)
    public static WebElement storeAmount;

    @FindBy(xpath = Path.xPathForRechargeOperatorshow)
    public static WebElement storeOperator;

    @FindBy(xpath = Path.xPathForRechargeTypeShow)
    public static WebElement storeType;

    @FindBy(xpath = Path.xPathForRechargeSuccessMsg)
    public static WebElement successMsg;

    @FindBy(xpath = Path.xPathForRechargeHome)
    public static WebElement home;


    @Test(priority = 0)
    public void testRechargeMenuClick() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(2000);
        rechargeMenu.click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void testRechargeMobSend() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(2000);
        giveRechargeMobile.clear();
        Thread.sleep(4000);
        giveRechargeMobile.sendKeys(Util.readConfigData()[11]);
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void testAmount() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(2000);
        rechargeAmount.clear();
        Thread.sleep(4000);
        rechargeAmount.sendKeys(Util.readConfigData()[5]);
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void testNextButton() throws InterruptedException, IOException, URISyntaxException {
        rechargeNext.click();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void testConfirmButton() throws InterruptedException, IOException, URISyntaxException {
        rechargeConfirm.click();
        Thread.sleep(2000);
        System.out.println("Context name is :" + Util.getCurrentContextHandle(driver));
        Thread.sleep(2000);

    }
    @Test(priority = 5)
    public final void testRechargeOkButton() throws InterruptedException, IOException, URISyntaxException {
        try {
            if (rechargeOkButton.isDisplayed()) {
                Thread.sleep(1000);
                ee1 = storeMobile;
                mobile = ee1.getText().toString();
                System.out.println(mobile);
                Thread.sleep(1000);
                ee3 = storeAmount;
                amount = ee3.getText().toString();
                System.out.println(amount);
                Thread.sleep(1000);
                ee4 = storeOperator;
                operator = ee4.getText().toString();
                System.out.println(operator);
                Thread.sleep(1000);
                ee2 = storeType;
                type = ee4.getText().toString();
                System.out.println(type);
                Thread.sleep(1000);
                msg=successMsg;
                msg1=msg.getText().toString();
                System.out.println(msg1);
                Thread.sleep(3000);
                rechargeOkButton.click();
                Thread.sleep(2000);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }


}
