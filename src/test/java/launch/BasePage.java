package launch;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;

public class BasePage {

    public static AndroidDriver driver;

    static {
        try {
            driver = AppLaunch.getInstance().driver;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public BasePage() throws IOException, InterruptedException {
    }
}
