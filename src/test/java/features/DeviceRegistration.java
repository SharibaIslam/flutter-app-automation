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

public class DeviceRegistration extends BasePage {
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());

    public DeviceRegistration() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(xpath = Path.xPathForDeviceRegPrompt)
    public static WebElement popUp;

    @FindBy(xpath = Path.xPathForDeviceRegYesButton)
    public static WebElement yesButton;

    @FindBy(xpath = Path.xPathFoDeviceRegSuccessMsg)
    public static WebElement successMsg;

    @FindBy(xpath = Path.xPathFoDeviceRegOkButtonClick)
    public static WebElement okButtonClick;

    @FindBy(xpath = Path.xPathForHomeButton)
    public static WebElement homeButtonClick;

    public boolean validateLoginPageUiELementsVisibility() throws InterruptedException, IOException {

        boolean popUpVisible = popUp.isDisplayed();

        if (popUpVisible) {
            return true;
        } else
            return false;
    }

    @Test(priority = 1)
    public void testDeviceRegistration() throws InterruptedException, IOException, URISyntaxException {
        yesButton.click();
        Thread.sleep(2000);
        System.out.println(Util.Push());
        Util.Push();
        Thread.sleep(12000);

    }
    @Test(priority = 2)
    public void okButtonClick() throws InterruptedException, IOException, URISyntaxException {
        okButtonClick.click();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void returnToHome() throws InterruptedException, IOException, URISyntaxException {
        homeButtonClick.click();
        Thread.sleep(2000);
    }

}
