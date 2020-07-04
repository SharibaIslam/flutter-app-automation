package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;


public class InputConfig {

        String result = "";
        InputStream inputStream=null;
        String Automation_Script_Copyright=null;
        String URL=null;
        String Login_wallet=null;
        String PIN=null;
        String CustomerSendMoneyWallet=null;
        String amount=null;
        String SendMoneyPurpose=null;
        String GiveBillerCodeToPayment=null;
        String GiveSTDIDToToPayment=null;
        String GiveSchoolMerchantToPayment=null;
        String GiveAgentWalletForCashOut=null;
        String GiveMobileForRecharge=null;
        String GiveNewPIN=null;
        String GiveFavPayeeName=null;
        String NID=null;
        String Name=null;
        String deviceName=null;
        String platformName=null;
        String appPackage=null;
        String appActivity=null;
        String GiveConfirmPIN=null;
        String MotherName=null;
        public static Properties prop;

        public  String[] getPropValues() throws IOException {

            try {
                Properties prop = new Properties();
                String propFileName = "config.properties";

                inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

                if (inputStream != null) {
                    prop.load(inputStream);
                } else {
                    throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
                }

                Date time = new Date(System.currentTimeMillis());

                // get the property value and print it out
                Automation_Script_Copyright = prop.getProperty("Automation_Script_Copyright");
                URL = prop.getProperty("URL");
                Login_wallet = prop.getProperty("LoginWallet");
                PIN = prop.getProperty("PIN");
                CustomerSendMoneyWallet=prop.getProperty("CustomerSendMoneyWallet");
                amount=prop.getProperty("amount");
                SendMoneyPurpose=prop.getProperty("SendMoneyPurpose");
                GiveBillerCodeToPayment=prop.getProperty("GiveBillerCodeToPayment");
                GiveSTDIDToToPayment=prop.getProperty("GiveSTDIDToToPayment");
                GiveSchoolMerchantToPayment=prop.getProperty("GiveSchoolMerchantToPayment");
                GiveAgentWalletForCashOut=prop.getProperty("GiveAgentWalletForCashOut");
                GiveMobileForRecharge=prop.getProperty("GiveMobileForRecharge");
                Name=prop.getProperty("Name");
                GiveNewPIN=prop.getProperty("GiveNewPIN");
                GiveConfirmPIN=prop.getProperty("GiveConfirmPIN");
                //MobileNumberForIBReg=prop.getProperty("MobileNumberForIBReg");
                //Address=prop.getProperty("Address");
                GiveFavPayeeName=prop.getProperty("GiveFavPayeeName");
                deviceName=prop.getProperty("deviceName");
                //GiveMerchantMobileForReg=prop.getProperty("GiveMerchantMobileForReg");
                platformName=prop.getProperty("platformName");
                appPackage=prop.getProperty("appPackage");
                appActivity=prop.getProperty("appActivity");




                result = "Result = "+ Automation_Script_Copyright + URL + ", " + Login_wallet + ", " + PIN;
                System.out.println(result + "\nProgram Ran on " + time + " by user=" + Automation_Script_Copyright);
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }finally {
                inputStream.close();
            }
            return new String[]{Automation_Script_Copyright, URL, Login_wallet, PIN, CustomerSendMoneyWallet, amount, SendMoneyPurpose,GiveBillerCodeToPayment, GiveSTDIDToToPayment,GiveSchoolMerchantToPayment, GiveAgentWalletForCashOut, GiveMobileForRecharge, GiveNewPIN, GiveFavPayeeName,
                    deviceName,platformName,appPackage,appActivity,GiveConfirmPIN};
        }

}
