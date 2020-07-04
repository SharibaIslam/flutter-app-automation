package features;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import javafx.stage.PopupWindow;
import launch.BasePage;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import util.Path;
import util.Util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.Instant;
import java.util.Date;

public class ChangePIN extends BasePage {
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());
    WebElement ee1,ee2,ee3,asuc,msg;
    public String txnId,toWallet,amount,asc,ascm,msg1,alrtMsg;
    WebDriverWait wait=new WebDriverWait(driver, 300);

    public ChangePIN() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @FindBy(xpath = Path.xPathForChangePINMenu)
    public static WebElement changePINMenu;

    @FindBy(xpath = Path.xPathForChangePINCurrentPIN)
    public static WebElement giveCurrentPIN;

    @FindBy(xpath = Path.xPathForChangePINNewPIN)
    public static WebElement giveNewPIN;

    @FindBy(xpath = Path.xPathForChangePINNewPINRetyped)
    public static WebElement newPINRetyped;

    @FindBy(xpath = Path.xPathForChangePINNextButton)
    public static WebElement chagePINNext;

    @FindBy(xpath = Path.xPathForChangePINOkButton)
    public static WebElement chagePINOkButton;

    @FindBy(xpath = Path.xPathForChangePINSuccessMsg)
    public static WebElement successMsg;

    @FindBy(xpath = Path.xPathForSubHeaderMenu)
    public static WebElement subMenu;

    @FindBy(xpath = Path.xPathForChangePINAlert)
    public static WebElement alert;


    @Test(priority = 0)
    public void testChangePINMenuClick() throws Exception {
        subMenu.click();
        Thread.sleep(2000);
        changePINMenu.click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void testCurrentPINSend() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(4000);
        giveCurrentPIN.sendKeys(Util.readConfigData()[3]);
        Thread.sleep(2000);

    }
    @Test(priority = 2)
    public void testNewPINSend() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(4000);
        giveNewPIN.clear();
        Thread.sleep(2000);
        giveNewPIN.sendKeys(Util.readConfigData()[12]);
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void testNewPINRetyped() throws InterruptedException, IOException, URISyntaxException {
        Thread.sleep(4000);
        newPINRetyped.clear();
        Thread.sleep(2000);
        newPINRetyped.sendKeys(Util.readConfigData()[18]);
        Thread.sleep(4000);
    }
    @Test(priority = 4)
    public void testNextButton() throws Exception {
        Thread.sleep(4000);
        chagePINNext.click();
        Thread.sleep(2000);
        Util.Push();
        Thread.sleep(8000);
        //driver.context((String) driver.getContextHandles().toArray()[2]);
        Thread.sleep(4000);
        Thread.sleep(4000);
        alert.click();
        String p=alert.getText();
        System.out.println(p);
        Thread.sleep(3000);


        WebDriverWait wait3 = new WebDriverWait(driver, 7000);
        wait3.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
    }
    @Test(priority = 5, alwaysRun = true, groups = "ChangePIN", dependsOnGroups = "Help")
    public void TestChangePINOkButton() throws InterruptedException, IOException, URISyntaxException {
        try {

                Thread.sleep(2000);
                chagePINOkButton.click();
                Thread.sleep(2000);
            }catch(Exception e){
            System.out.println(e);
        }
    }
    public void returnToDashBoardCheck() throws Exception {
        subMenu.click();
        Thread.sleep(1000);


    }

}
