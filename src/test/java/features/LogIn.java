package features;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import launch.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import util.Path;
import util.Util;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;


public class LogIn extends BasePage {
    Date time = new Date(System.currentTimeMillis());

    public LogIn() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @FindBy(xpath = Path.xPathForWallet)
    public WebElement walletNumber;

    @FindBy(xpath = Path.xPathForPIN)
    public WebElement loginPIN;

    @FindBy(xpath = Path.xPathForLoginButton)
    public  WebElement loginButton;

    @FindBy(xpath = Path.xPathForBlank)
    public WebElement blank;

    @FindBy(xpath = Path.xPathForDeviceRegPrompt)
    public static WebElement deviceRegPrompt;

    @FindBy(xpath = Path.xPathForDashboard)
    public static WebElement dashboard;




    @Test(priority = 1)
    public void testLogin() throws InterruptedException, IOException, URISyntaxException {

        Thread.sleep(13000);
        blank.click();
        Thread.sleep(2000);
        walletNumber.clear();
        Thread.sleep(2000);
        walletNumber.sendKeys(Util.readConfigData()[2]);
        System.out.println(driver.getPageSource());
        System.out.println(Util.readConfigData()[2]);
        Thread.sleep(2000);
        loginPIN.clear();
        Thread.sleep(2000);
        loginPIN.sendKeys(Util.readConfigData()[3]);
        Thread.sleep(2000);



    }

    @Test(priority = 2)
    public void testLoginButton() throws InterruptedException, IOException, URISyntaxException {

            Thread.sleep(2000);
            String m=loginButton.getText();
            System.out.println(m);
            loginButton.click();
            System.out.println("Login successful: "+m);



            //loginButton.click();
            System.out.println(driver.getPageSource());

            Thread.sleep(2000);
            Util.Push();
            Thread.sleep(12000);
            Thread.sleep(2000);


    }

}