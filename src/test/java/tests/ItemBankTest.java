package tests;

import com.relevantcodes.extentreports.LogStatus;
import core.CoreTest;
import org.testng.annotations.Test;
import pageobjects.HomePageObject;
import pageobjects.ItemBankPageObject;
import pageobjects.MyResourcePageObject;

import static enums.Resources.ItemBank;

public class ItemBankTest extends CoreTest
{
    @Test(groups = { "ItemBank" })
    public void ItemBankTest001_Create_New_ItemBank() throws Exception
    {
        test=extent.startTest("ItemBankTest001_Create_New_ItemBank()");
        Log.info("Inside Test 'ItemBankTest001_Create_New_ItemBank()'");

        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login Page object

        objHomePage.navigateToMyResourcePage();
        Thread.sleep(2000);
        objMyResource.createNewResourceOld(ItemBank);
        objMyResource.SaveAndExitOldResources();

        test.log(LogStatus.PASS,"Sucessfully Created Item Bank");
    }

    @Test(groups = { "ItemBank" })
    public void ItemBankTest002_Edit_ItemBank() throws InterruptedException
    {
        test=extent.startTest("ItemBankTest002_Edit_ItemBank()");
        Log.info("Inside Test 'ItemBankTest002_Edit_ItemBank()'");

        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login Page object
        ItemBankPageObject objItemBank = new ItemBankPageObject(driver); //Create Item Bank page object

        try {
            objHomePage.navigateToMyResourcePage();
        } catch (Exception e) {

        }
        Thread.sleep(2000);
        objMyResource.createNewResourceOld(ItemBank);
        objMyResource.SaveAndExitOldResources();
        objItemBank.editItemBank();

        test.log(LogStatus.PASS,"Sucessfully edited Item Bank");
    }


}