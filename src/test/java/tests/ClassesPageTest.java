package tests;

import com.relevantcodes.extentreports.LogStatus;
import core.CoreTest;
import org.testng.annotations.Test;
import pageobjects.ClassesPageObject;
import pageobjects.HomePageObject;
import pageobjects.MyResourcePageObject;

import static enums.ClassType.*;

public class ClassesPageTest extends CoreTest
{
    @Test(groups = { "Classes" })
    public void ClassesTest001_Create_New_Student_generated_Class() throws Exception
    {
        test=extent.startTest("ClassesTest001_Create_New_Student_generated_Class()");
        Log.info("Inside Test 'ClassesTest001_Create_New_Student_generated_Class()'");

        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login Page object
        ClassesPageObject objClasses = new ClassesPageObject(driver); //Create Classes page object

        objHomePage.navigateToClassesPage();
        Thread.sleep(3000);
        objClasses.clickOnNewClassButton();
        objClasses.createNewClass(StudentGenerated);
        objHomePage.navigateToMyResourcePage();
        test.log(LogStatus.PASS,"Sucessfully Created New Studnet Generated Class");
    }

    @Test(groups = { "Classes" })
    public void ClassesTest002_Create_New_Teacher_generated_Class() throws Exception
    {
        test=extent.startTest("ClassesTest002_Create_New_Teacher_generated_Class()");
        Log.info("Inside Test 'ClassesTest001_Create_New_Student_generated_Class()'");
        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login Page object
        ClassesPageObject objClasses = new ClassesPageObject(driver); //Create Classes page object

        objHomePage.navigateToClassesPage();
        Thread.sleep(3000);
        objClasses.clickOnNewClassButton();
        objClasses.createNewClass(TeacherGenerated);
        objHomePage.navigateToMyResourcePage();
        test.log(LogStatus.PASS,"Sucessfully Created New Teacher Generated Class");

    }
}