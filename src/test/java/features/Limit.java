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

public class Limit extends BasePage {
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());

    public Limit() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForSubHeaderMenu)
    public static WebElement subMenu;

    @FindBy(xpath = Path.xPathForLimitMenuClick)
    public static WebElement menuClick;

    @FindBy(xpath = Path.xPathForLimitMenuTab2Click)
    public static WebElement tab2Click;

    @FindBy(xpath = Path.xPathForLimitMenuTab3Click)
    public static WebElement tab3Click;

    @FindBy(xpath = Path.xPathForLimitMenuTestCase)
    public static WebElement testCase;

    @FindBy(xpath = Path.xPathForSubHeaderMenu)
    public static WebElement homeButton;


    @Test(priority = 0)
    public void testLimitSubMenuClick() throws Exception {
        subMenu.click();
        Thread.sleep(2000);
        Util.attachScreenShot(driver);
    }
    @Test(priority = 1)
    public void testLimitMenuClick() throws Exception {
        menuClick.click();
        Thread.sleep(2000);
        Util.attachScreenShot(driver);
    }
    @Test(priority = 2)
    public void secondTabCheck() throws InterruptedException, IOException, URISyntaxException {
        tab2Click.click();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void thirdTabCheck() throws InterruptedException, IOException, URISyntaxException {
        tab3Click.click();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void returnToDashBoardCheck() throws Exception {
        subMenu.click();
        Thread.sleep(1000);

    }


}
