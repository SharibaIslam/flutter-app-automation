package util;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Attachment;
import launch.AppLaunch;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import push.*;
import launch.BasePage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.*;

public class Util extends BasePage {
    WebElement element;
    public static String str = "NEXT";
    public Util() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @Attachment(value = "ScreenShot", type = "image/png")
    public static byte[] attachScreenShot(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    public static String[] readConfigData() throws IOException {
        InputConfig ip=new InputConfig();
        String result[] = ip.getPropValues();
        return result;
    }

    public static void switchToContext(String context, RemoteWebDriver _driver) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(_driver);
        Map<String,String> params = new HashMap<>();
        params.put("name", context);
        executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
    }
    public static String getCurrentContextHandle(RemoteWebDriver _driver) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(_driver);
        String context =  (String) executeMethod.execute(DriverCommand.GET_CURRENT_CONTEXT_HANDLE, null);
        return context;
    }
    public static List<String> getContextHandles(RemoteWebDriver _driver) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(_driver);
        List<String> contexts =  (List<String>) executeMethod.execute(DriverCommand.GET_CONTEXT_HANDLES, null);
        return contexts;
    }

    public static int Push() throws InterruptedException, IOException, URISyntaxException {
        PushForCustomerLogin pushForLogin = new PushForCustomerLogin();
        int push = pushForLogin.PushApi();
        System.out.printf("Push value is " + push);
        return push;
    }
    public Properties readPropertiesData() {
        Properties prop = new Properties();
        try {
            InputStream inputStream;
            String propFileName = "config.properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
        } catch (Exception e) {

        }
        return prop;
    }
    public static void time() throws Exception{
        Date time = new Date(System.currentTimeMillis());
    }
     public static void scroll() throws Exception{
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ str + "\").instance(0))");
         Thread.sleep(10000);
     }

    public static String alertMessageHandle() throws Exception{
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(3000);
        String alertMessage3=driver.switchTo().alert().getText();
        System.out.println(alertMessage3);
        Thread.sleep(2000);
        alert3.accept();
        Thread.sleep(2000);
        return alertMessage3;
    }

}

