package tests;
import com.relevantcodes.extentreports.LogStatus;
import core.CoreTest;
import org.testng.annotations.Test;
import pageobjects.HomePageObject;
import pageobjects.MyResourcePageObject;

import static enums.Resources.*;

public class MyResourcePageTest extends CoreTest
{
    @Test(groups = { "MyResource" })
    public void MyResourceTest001_Create_New_Lesson() throws Exception
    {
        test=extent.startTest("MyResourceTest001_Create_New_Lesson()");
        Log.info("Inside Test 'MyResourceTest001_Create_New_Lesson()'");
        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login Page object

        objHomePage.navigateToMyResourcePage();
        Thread.sleep(2000);
        objMyResource.createNewResourceNew(Lesson);
        objMyResource.SaveAndExitNewResources();
        test.log(LogStatus.PASS,"Sucessfully Created New Lesson");
    }
    @Test(groups = { "MyResource" })
    public void MyResourceTest002_Create_New_Activity() throws Exception
    {
        test=extent.startTest("MyResourceTest002_Create_New_Activity()");
        Log.info("Inside Test 'MyResourceTest002_Create_New_Activity()'");
        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login Page object

        objHomePage.navigateToMyResourcePage();
        Thread.sleep(2000);
        objMyResource.createNewResourceNew(Activity);
        objMyResource.SaveAndExitNewResources();
        test.log(LogStatus.PASS,"Sucessfully Created Activity");
    }
    @Test(groups = { "MyResource" })
    public void MyResourceTest003_Create_New_Assessment() throws Exception
    {
        test=extent.startTest("MyResourceTest003_Create_New_Assessment()");
        Log.info("Inside Test 'MyResourceTest003_Create_New_Assessment()'");
        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login Page object

        objHomePage.navigateToMyResourcePage();
        Thread.sleep(2000);
        objMyResource.createNewResourceNew(Assessment);
        objMyResource.SaveAndExitNewResources();
        test.log(LogStatus.PASS,"Sucessfully Created New Assessment");
    }

    @Test(groups = { "Upload" })
    public void MyResourceTest004_File_Upload_Image() throws Exception
    {
        test=extent.startTest("MyResourceTest004_File_Upload_Image()");
        Log.info("Inside Test 'MyResourceTest004_File_Upload_Image()'");
        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login Page object

        objHomePage.navigateToMyResourcePage();
        Thread.sleep(2000);
        objMyResource.FileUpload();
        objHomePage.navigateToMyResourcePage();
        Thread.sleep(20000);
        test.log(LogStatus.PASS,"Sucessfully Uploaded Image to My Resources");
    }


}