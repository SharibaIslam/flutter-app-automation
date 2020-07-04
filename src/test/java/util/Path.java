package util;

public class Path {
    public static final String xPathForWallet = "//android.widget.EditText[@index='5']";
    public static final String xPathForPIN = "//android.widget.EditText[@index='6']";
    public static final String xPathForBlank = "//android.view.View[@index=2]";
    //public static final String xPathForLoginButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";
    public static final String xPathForLoginButton = "//android.widget.Button[@index='7']";
    public static final String xPathForDeviceRegPrompt = "//android.view.View[contains(@text, 'Device Registration')]";
    public static final String xPathForDashboard = "//android.view.View[contains(@text, 'Activity')]";
    public static final String xPathForDeviceRegYesButton = "//android.view.View[contains(@text, 'OK')]";
    public static final String xPathFoDeviceRegSuccessMsg= "//android.view.View[contains(@text, 'Device has been registered successfully')]";
    public static final String xPathFoDeviceRegOkButtonClick= "//android.widget.Button[contains(@text, 'Ok')]";
    public static final String xPathForHomeButton= "//android.widget.Button[@index='3']";
    public static final String xPathForSendMoney= "//android.widget.ImageView[@index='4']";
    public static final String xPathForSendMoneyWallet= "//android.widget.EditText[contains(@text, 'Wallet')]";
    public static final String xPathForSendMoneyAmount= "//android.widget.EditText[@index='3']";
    public static final String xPathForSendMoneyPurpose= "//android.widget.EditText[contains(@text, 'Purpose')]";
    public static final String xPathForSendMoneyNext= "//android.widget.Button[contains(@text, 'NEXT')]";
    public static final String xPathForSendMoneyConfirm= "//android.widget.Button[contains(@text, 'Confirm')]";
    //public static final String xPathForSendMoneyConfirm2= "//android.widget.Button[@index='0']";
    public static final String xPathForSendMoneyOkbutton= "//android.widget.Button[@index='9']";
    public static final String xPathForSendMoneyShowWallet= "//android.view.View[@index='1']/android.view.View[@index='2']";
    public static final String xPathForSendMoneyShowAmount= "//android.view.View[@index='4']";
    public static final String xPathForSendMoneyTXNID= "//android.view.View[@index='6']";
    public static final String xPathForSendMoneyPurposeStore= "//android.view.View[@index='8']";
    public static final String xPathForSendMoneyTestCase= "//android.view.View[@index='1']/android.view.View[@index='0']";
    public static final String xPathForSendMoneyHomeButton= "//android.widget.Button[@index='3']";
    public static final String xPathForSendMoneyTap= "//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']";
    public static final String xPathForPaymentMenuHit= "//android.widget.ImageView[@index='5']";
    public static final String xPathForPaymentPayee= "//android.widget.EditText[@index='2']";
    public static final String xPathForPaymentNext= "//android.widget.Button[contains(@instance, '2')]";
    public static final String xPathForPaymentAmount= "//android.widget.EditText[@index='2']";
    public static final String xPathForNextButton= "//android.widget.Button[contains(@instance, '2')]";
    public static final String xPathForPaymentConfirmButton= "//android.widget.Button[@index='8']";
    public static final String xPathForOKButtonClick= "//android.widget.Button[@index='8']";
    public static final String xPathPaymentCheckAddFavPayee= "//android.widget.CheckBox[@index='7']";
    public static final String xPathPaymentAddFavPayeeName= "//android.widget.EditText[@index='8']";
    public static final String xPathForSuccessPayee= "//android.view.View[@index='2']/android.view.View[@index='2']";
    public static final String xPathForSuccessMerchantWallet= "//android.view.View[@index='2']/android.view.View[@index='4']";
    public static final String xPathForSuccessMerchantAmount= "//android.view.View[@index='2']/android.view.View[@index='6']";
    public static final String xPathForSuccessTXNID= "//android.view.View[@index='2']/android.view.View[@index='8']";
    public static final String xPathForSuccessMessage= "//android.view.View[@index='2']/android.view.View[@index='0']";
    public static final String xPathForOKButtonAfterAddedPayee= "//android.widget.Button[@index='9']";
    public static final String xPathForPaymentHomeButton= "//android.view.View[0]/android.widget.Button[@index='3']";
    //school payment
    public static final String xPathForPaymentPayeesch= "//android.widget.EditText[@index='2']";
    public static final String xPathForPaymentNextsch= "//android.widget.Button[contains(@instance, '2')]";
    public static final String xPathForEnterStdID="//android.view.View[@index='2']/android.widget.EditText[@index='2']";
    public static final String xPathForSchoolNext="//android.view.View[@index='2']/android.widget.Button[@index='3']";
    public static final String xPathForSchoolNxt="//android.widget.Button[@index='4']";
    public static final String xPathForSchoolConfirm="//android.widget.Button[@index='12']";
    public static final String xPathForSchoolOkButton="//android.view.View[@index='2']/android.widget.Button[@index='13']";
    public static final String xPathForSchoolSTDNumber="//android.view.View[@index='2']/android.view.View[@index='6']";
    public static final String xPathForSchoolSTDName="//android.view.View[@index='2']/android.view.View[@index='8']";
    public static final String xPathForSchoolSTDAmt="//android.view.View[@index='2']/android.view.View[@index='10']";
    public static final String xPathForSchoolSTDTxnID="//android.view.View[@index='2']/android.view.View[@index='12']";
    public static final String xPathForSchoolSTDPayee="//android.view.View[@index='2']/android.view.View[@index='2']";
    public static final String xPathForSchoolSTDWallet="//android.view.View[@index='2']/android.view.View[@index='4']";
    public static final String xPathForSchoolPaymentsuccessMsg="//android.view.View[@index='2']/android.view.View[@index='0']";
    public static final String xPathForSchoolPaymentDueMsg="//android.widget.ScrollView[@index='2']/android.view.View[@index='4']";
    //Cash-Out
    public static final String xPathForCashOutMenuHit="//android.widget.ImageView[@index='6']";
    public static final String xPathForCashOutAgentWallet="//android.widget.EditText[@index='0']";
    public static final String xPathForCashOutAmount="//android.widget.EditText[@index='1']";
    public static final String xPathForCashOutNext="//android.widget.Button[@index='2']";
    public static final String xPathForCashOutConfirm="//android.widget.Button[@index='6']";
    public static final String xPathForCashOutGetAgentWallet="//android.view.View[@index='2']/android.view.View[@index='2']";
    public static final String xPathForCashOutGetAmount="//android.view.View[@index='2']/android.view.View[@index='4']";
    public static final String xPathForCashOutGetTxnID="//android.view.View[@index='2']/android.view.View[@index='6']";
    public static final String xPathForCashOutOkButton="//android.view.View[@index='2']/android.widget.Button[@index='7']";
    public static final String xPathForCashOutSuccessPage="//android.view.View[@index='2']/android.view.View[@index='0']";
    public static final String xPathForCashOutHome="//android.widget.Button[@index='3']";
    //Recharge
    public static final String xPathForRechargeMenuHit="//android.widget.ImageView[@index='7']";
    public static final String xPathForRechargeMobile="//android.widget.EditText[@index='1']";
    public static final String xPathForRechargeAmount="//android.widget.EditText[@index='2']";
    public static final String xPathForRechargeNext="//android.widget.Button[@index='8']";
    public static final String xPathForRechargeHome="//android.view.View[@index='0']/android.widget.Button[@index='3']";
    public static final String xPathForRechargeConfirm="//android.widget.Button[@index='10']";
    public static final String xPathForRechargeSuccessMsg="//android.view.View[@index='2']/android.view.View[@index='0']";
    public static final String xPathForRechargemobshow="//android.view.View[@index='2']/android.view.View[@index='2']";
    public static final String xPathForRechargeOperatorshow="//android.view.View[@index='2']/android.view.View[@index='4']";
    public static final String xPathForRechargeAmountshow="//android.view.View[@index='2']/android.view.View[@index='6']";
    public static final String xPathForRechargeTypeShow="//android.view.View[@index='2']/android.view.View[@index='8']";
    public static final String xPathForRechargeOkbutton="//android.view.View[@index='2']/android.widget.Button[@index='9']";

    public static final String xPathForSubHeaderMenu="//android.view.View[@index='0']/android.widget.Button[@index='0']";
    public static final String xPathForTxnHistoryDetails="/html/body/ion-app/ng-component/ion-nav/page-transaction-history/ion-content/div[2]/ion-list";
    public static final String xPathForTxnHistoryHomeButton="/html/body/ion-app/ng-component/ion-nav/page-transaction-history/ion-header/ion-toolbar/button";
    public static final String xPathForChangePINMenu="//android.view.View[@index='5']";
    //public static final String xPathForChangePINCurrentPIN="//android.widget.EditText[@index='2']]";
    public static final String xPathForChangePINCurrentPIN="//android.widget.EditText[contains(@text, 'Current PIN')]";
    //public static final String xPathForChangePINNewPIN="//android.widget.EditText[contains(@text, 'New PIN')]";
    public static final String xPathForChangePINNewPIN="//android.widget.EditText[@index='3']";
    //public static final String xPathForChangePINNewPINRetyped="//android.widget.EditText[contains(@text, 'New PIN (Retyped)')]";
    public static final String xPathForChangePINNewPINRetyped="//android.widget.EditText[@index='4']";
    public static final String xPathForChangePINNextButton="//android.widget.Button[@index='5']";
    public static final String xPathForChangePINAlert="//android.view.View[contains(@instance, '4')]";
    //public static final String xPathForChangePINAlert="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View";
    public static final String xPathForChangePINSuccessMsg="/html/body/ion-app/ng-component/ion-nav/page-change-pin-success/ion-content/div[2]/ion-grid/ion-row[1]";
    public static final String xPathForChangePINOkButton="//android.view.View[contains(@text, 'Alert\n" +
            "Your PIN has been changed successfully.\n" +
            "OK')]";
    //public static final String xPathForChangePINOkButton="/html/body/ion-app/ng-component/ion-nav/page-change-pin-success/ion-content/div[2]/ion-grid/ion-row[2]/button";
    public static final String xPathForChangePINHomeButton="/html/body/ion-app/ng-component/ion-nav/page-change-pin-success/ion-header/ion-toolbar/button";
    public static final String xPathForLimitMenu="//*[@id=\"customer\"]/div/ion-content/div[2]/ion-list/button[4]";
    public static final String xPathForLimitMenuClick="//android.view.View[@index='7']";
    public static final String xPathForLimitMenuTab2Click="//android.view.View[@index='2']";
    public static final String xPathForLimitMenuTab3Click="//android.view.View[@index='3']";
    public static final String xPathForLimitMenuTestCase="//android.view.View[@index='3']";
    public static final String xPathForHomeMenuEnter="//android.view.View[contains(@text, 'Home')]";
    public static final String xPathForHelpMenu="//*[@id=\"customer\"]/div/ion-content/div[2]/ion-list/button[6]";
    public static final String xPathForHelpMenuEnter="/html/body/ion-app/ng-component/ion-nav/page-help-content/ion-content/div[2]/p[1]";
    public static final String xPathForHelpMenuHome="/html/body/ion-app/ng-component/ion-nav/page-help-content/ion-header/ion-toolbar/button";
    public static final String xPathForLogOut="//*[@id=\"customer\"]/div/ion-content/div[2]/ion-list/button[7]";
    public static final String xPathForTap="/html/body/ion-app/ng-component/ion-nav/page-home/ion-content/div[2]/ion-grid/ion-scroll/div/div/ion-list/ion-item[1]";


    public static final String xPathForFavPaymentMenuAdd="/html/body/ion-app/ng-component/ion-nav/page-payment/ion-content/div[2]/ion-scroll[2]/div/div/ion-list/ion-item-sliding[1]";
    public static final String xPathForFavPaymentDeleteButton="//button[@class='disable-hover button button-md button-default button-default-md button-md-danger']";

}
