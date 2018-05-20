package tests;

import core.CoreTest;
import org.testng.annotations.Test;
import pageobjects.AssessmentBuilderPageObject;
import pageobjects.HomePageObject;
import pageobjects.MyResourcePageObject;

import static enums.Resources.Assessment;

public class AssessmentTest extends CoreTest
{

    @Test(groups = {"Assessment"})
    public void AssessmentTest001_Add_MCQ_In_Assessment() throws Exception
    {
        HomePageObject objHomePage = new HomePageObject(driver);  //Create Home PageObject
        MyResourcePageObject objMyResource = new MyResourcePageObject(driver); //Create Login PageObject
        AssessmentBuilderPageObject objAssessment = new AssessmentBuilderPageObject(driver); //Create AssesmentBuilder PageObject

        objHomePage.navigateToMyResourcePage();
        Thread.sleep(2000);
        objMyResource.createNewResourceNew(Assessment);

        // *******************MCQ type question logic  *******************

        objAssessment.enterQuestionInstruction("MCQ type question Instruction Text");
        objAssessment.attchedImageToQI();
        objAssessment.selectImageFromAttachimageList();
        //Thread.sleep(5000);
        objAssessment.clickOnAttachImageButton();
        // Thread.sleep(5000);
        objAssessment.enableFeedbackButton();
        objAssessment.clickOnAddQuestionButtonFromBuilder();

        Thread.sleep(3000);

    }
}