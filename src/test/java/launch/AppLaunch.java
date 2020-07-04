package launch;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.*;
import util.Util;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class AppLaunch {
    public static AndroidDriver driver;
    public static AppLaunch instance;

    private AppLaunch() {
        setUp();
    }

    public static AppLaunch getInstance() throws IOException, InterruptedException {
        if (instance == null) {
            instance = new AppLaunch();
        }
        return instance;
    }
      private void setUp(){
        // Created object of DesiredCapabilities class.
            try {
                DesiredCapabilities cap = new DesiredCapabilities();
                Util util = new Util();
                Properties prop = util.readPropertiesData();
                cap.setCapability("deviceName", prop.getProperty("deviceName"));
                cap.setCapability("platformName", prop.getProperty("platformName"));
                cap.setCapability(CapabilityType.BROWSER_NAME, "Android");
                cap.setCapability("appPackage", prop.getProperty("appPackage"));
                //cap.setCapability("avd", prop.getProperty("avdDevices"));
                cap.setCapability("appActivity", prop.getProperty("appActivity"));
                cap.setCapability("platformVersion",prop.getProperty("platformVersion"));
                //cap.setCapability("app",prop.getProperty("appPath"));
                cap.setCapability("autoGrantPermissions", true);
                cap.setCapability("autoAcceptAlerts", true);
                cap.setCapability("autoDismissAlerts", true);
                cap.setCapability("autoWebView", false);
                //cap.setCapability("connectHardwareKeyboard", false);
                cap.setCapability("unicodeKeyboard", true);
                //cap.setCapability("resetKeyboard", true);
                cap.setCapability("newCommandTimeout","1000");




                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                Thread.sleep(2000);

            }catch(Exception e){
                System.out.println(e.toString());
            }


    }


}
