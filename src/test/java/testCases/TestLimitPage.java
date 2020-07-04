package testCases;


import features.Limit;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestLimitPage {
    Limit limit;
    Date time = new Date(System.currentTimeMillis());
    String ascm;
 @BeforeTest
    public void init() throws Exception{
     limit=new Limit();
 }

    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "TestLimitPage", dependsOnGroups = "TestLoginPage")
    public void testMenu() throws Exception {
        limit.testLimitSubMenuClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "TestLimitPage", dependsOnGroups = "TestLoginPage")
    public void menuCheck() throws Exception {
        Thread.sleep(1000);
        limit.testLimitMenuClick();
    }
    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "TestLimitPage", dependsOnGroups = "TestLoginPage")
    public void secondTabCheck() throws IOException, InterruptedException, URISyntaxException {

        Thread.sleep(1000);
        limit.secondTabCheck();
    }
    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "TestLimitPage", dependsOnGroups = "TestLoginPage")
    public void thirdTabCheck() throws IOException, InterruptedException, URISyntaxException {

        Thread.sleep(1000);
        limit.thirdTabCheck();
    }
    @Test(priority = 3,alwaysRun = true, enabled = true, groups = "TestLimitPage", dependsOnGroups = "TestLoginPage")
    public void testCaseForSendMoney() throws Exception {
        // Verify login/test case
        try {
            if (limit.testCase.isDisplayed()) {
                Allure.addDescription("Status: PASS \n\r Type: Limit Display \n\r Date Time: " + (time.toString()));
            }
        }catch (Exception e){
            limit.returnToDashBoardCheck();
            Assert.fail("Status: FAIL \n\r Type: Limit Display \n\r Date Time: " + (time.toString()));
        }
    }

    @Test(priority = 4,alwaysRun = true, enabled = true, groups = "TestLimitPage", dependsOnGroups = "TestLoginPage")
    public void testReturnHome() throws Exception {

        limit.returnToDashBoardCheck();
    }

}
