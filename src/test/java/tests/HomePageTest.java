package tests;

import com.relevantcodes.extentreports.LogStatus;
import core.CoreTest;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import pageobjects.HomePageObject;
import pageobjects.MyResourcePageObject;



public class HomePageTest extends CoreTest
{
    private static Logger Log = Logger.getLogger(HomePageTest.class.getName());

    @Test(groups = {"HomePage"})
    public void HomePage001_Navigate_To_Resources_Page() throws Exception
    {
        test=extent.startTest("HomePage001_Navigate_To_Resources_Page()");
        Log.info("Inside Test 'HomePage001_Navigate_To_Resources_Page()'");
        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login Page object

        //Navigate to My Resource page
        objHomePage.navigateToMyResourcePage();
        test.log(LogStatus.PASS,"Sucessfully navigated to My Resource page");
    }

    @Test(groups = {"HomePage"})
    public void HomePage002_Navigate_To_Classes_Page() throws Exception
    {
        test=extent.startTest("HomePage002_Navigate_To_Classes_Page()");
        Log.info("Inside Test 'HomePage002_Navigate_To_Classes_Page()'");
        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login Page object

        //Navigate to My Resource page
        objHomePage.navigateToClassesPage();
        test.log(LogStatus.PASS,"Sucessfully navigated to Classes page");
    }
    @Test(groups = {"HomePage"})
    public void HomePage003_Navigate_To_Home_Page() throws Exception
    {
        test=extent.startTest("HomePage003_Navigate_To_Home_Page()");
        Log.info("Inside Test 'HomePage003_Navigate_To_Home_Page()'");
        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login Page object
        //Navigate to My Resource page

        objHomePage.navigateToClassesPage();
        objHomePage.navigateToHomePage();
        test.log(LogStatus.PASS, "Sucessfully navigated to Home page");
    }
    @Test(groups = {"HomePage"})
    public void HomePage004_Navigate_To_Marketplace_Page() throws Exception
    {
        test=extent.startTest("HomePage004_Navigate_To_Marketplace_Page()");
        Log.info("Inside Test 'HomePage004_Navigate_To_Marketplace_Page()'");
        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login Page object

        //Navigate to My Resource page
        objHomePage.navigateToMrketplacePage();
        test.log(LogStatus.PASS,"Sucessfully navigated to Marketplace page");
    }
}