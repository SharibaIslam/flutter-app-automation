package testCases;


import features.DeviceRegistration;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestDeviceRegPage {
    DeviceRegistration deviceRegistration;
    Date time = new Date(System.currentTimeMillis());
    String getRegisteredDevice;
 @BeforeTest
    public void init() throws Exception {
     deviceRegistration = new DeviceRegistration();
 }
   @Test(priority = 0,alwaysRun = true, groups = "TestDeviceRegPage", dependsOnGroups = "TestLoginPage")
    public void testUiElementVisibility() throws IOException, InterruptedException, URISyntaxException {
        Assert.assertEquals(true, deviceRegistration.validateLoginPageUiELementsVisibility());
    }

    @Test(priority = 1,alwaysRun = true, groups = "TestDeviceRegPage", dependsOnGroups = "TestLoginPage")
    public void testDeviceRegYesButtonClick() throws IOException, InterruptedException, URISyntaxException {
        deviceRegistration.testDeviceRegistration();
    }
    @Test(priority = 2, alwaysRun = true, groups = "TestDeviceRegPage", dependsOnGroups = "TestLoginPage")
    public void deviceRegistrationTestCase() throws Exception {
        try{
            String getRegisteredDevice=deviceRegistration.successMsg.getText();
            String actualErrorMsg="Device has been registered successfully";
            if(getRegisteredDevice.equalsIgnoreCase(actualErrorMsg)){
                Allure.addDescription("Status: PASS \n\r Type: Device Registration \n\r Date Time: " + (time.toString())+ "\n\r Device Registered Wallet: " + Util.readConfigData()[2]);
            }

        }catch (Exception e){
            try{
                String actualErrorMsg2="Registration failed.This device is registered with another wallet.";
                if(getRegisteredDevice.equalsIgnoreCase(actualErrorMsg2)){
                    Allure.addDescription("Status: PASS \n\r Type: Device Registration: Already registered with other device \n\r Date Time: " + (time.toString())+ "\n\r Device Registered Wallet: " + Util.readConfigData()[2]);
                }
            }catch (Exception f){

                Assert.fail("Status: FAIL \n\r Type: Device Registration \n\r Date Time: " + (time.toString()));
            }
        }

    }
    @Test(priority = 3,alwaysRun = true, groups = "TestDeviceRegPage", dependsOnGroups = "TestLoginPage")
    public void testOkButton() throws IOException, InterruptedException, URISyntaxException {
        deviceRegistration.okButtonClick();
    }


}
