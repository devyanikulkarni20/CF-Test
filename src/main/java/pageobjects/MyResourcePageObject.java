package pageobjects;

import enums.Resources;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class MyResourcePageObject extends CommonMethods
{
    //WebDriver driver;

    @FindBy(css = ".button.button-primary.add.tree-header-button")
    private WebElement btnNewResource;

    @FindBy(css = ".object-label.folder")
    private WebElement lnkFolder;

    @FindBy(css = ".object-label.lesson")
    private WebElement lnkLesson;

    @FindBy(css = ".object-label.activity")
    private WebElement lnkActivity;

    @FindBy(css = ".object-label.assessment")
    private WebElement lnkAssessment;

    @FindBy(css = ".object-label.learning-pack")
    private WebElement lnkContentBundle;

    @FindBy(css = ".object-label.item-bank")
    private WebElement lnkItemBank;

    @FindBy(css = ".object-label.rubric")
    private WebElement lnkRubric;

    @FindBy(css = ".object-label.trophy")
    private WebElement lnkBadge;

    @FindBy(css = ".object-label.upload")
    private WebElement lnkFileUpload;

    @FindBy(css = ".object-label.link")
    private WebElement lnkWebPageURL;

    @FindBy(css = ".object-label.assignment")
    private WebElement lnkAssignment;

    @FindBy(css = "input.editable-title__title-input")
    private WebElement txtTitle;

    @FindBy(css = "button.p-icon-times")
    private WebElement  btnCloseVideo;

    @FindBy(css ="button.builder-header__menu-button" )
    private WebElement builderNavigation;

    @FindBy(css = ".save.button-tertiary.light")
    private WebElement btnSave;

    @FindBy(css = ".exit.button-tertiary.light")
    private WebElement btnExit;
    @FindBy(css ="span.p-icon-save" )
    private WebElement btnResourceSave;

    @FindBy(css ="span.p-icon-sign-out" )
    private WebElement btnExitBuilder;

    @FindBy(name="name")
    WebElement txtTitleOldResource ;

    @FindBy(css=".save.button.button-tertiary.light")
    WebElement btnSaveItemBank;

    @FindBy(css =".exit.button.button-tertiary.light")
    WebElement btnExitItemBank;

    @FindBy(css = ".button.yes.button-secondary")
    WebElement btnConfirmYes;

   //public MyResourcePageObject(WebDriver driver)
    public MyResourcePageObject(RemoteWebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnNewResourceButton() throws InterruptedException {
        btnNewResource.click();
        Thread.sleep(3000);
    }

    public void selectResourceFromNewButton(Resources resourceName) throws InterruptedException {
        Thread.sleep(2000);
        //if (resourceName.equals(resourceName.Lesson)
            switch (resourceName)
            {
                //Lesson
                case Lesson:
                {
                    lnkLesson.click();
                    break;
                }
                //Activity
                case Activity:
                {
                    lnkActivity.click();
                    break;
                }
                // Assessment
                case Assessment:
                {
                    lnkAssessment.click();
                    break;
                }
                //Content Bundle
                case ContentBundle:
                {
                    lnkContentBundle.click();
                    break;
                }
                //item bank
                case ItemBank:
                {
                    lnkItemBank.click();
                    break;
                }
                //Rubric
                case Rubric:
                {
                    lnkRubric.click();
                    break;
                }
                //Badge
                case Badge:
                {
                    lnkBadge.click();
                    break;
                }
                //Assignment
                case Assignment:
                {
                    lnkAssignment.click();
                    break;
                }
            }
    }


    /** This Method will create New type of resource
     *  Creation includes Title updation, Save and Exit and check in My resources
     *  @param resourceName
     **/
    public void createNewResourceNew(Resources resourceName) throws InterruptedException
    {
        Log.info("Inside Method 'createNewResourceNew()' for resource "+resourceName);

        btnNewResource.click();
        Thread.sleep(2000);
        selectResourceFromNewButton(resourceName);
        Thread.sleep(2000);
       // handleVideoPopUp();
        txtTitle.click();
        txtTitle.clear();
        txtTitle.sendKeys("New Title "+resourceName);
        //SaveAndExitNewResources();
    }
    /**
     * closes the video pop-up if appears
     */
    public void handleVideoPopUp() throws InterruptedException
    {
        Log.info("Inside Method 'handleVideoPopUp()'");
        Thread.sleep(3000);
        if(driver.getPageSource().contains("Play Video"))
        {
           btnCloseVideo.click();
        }
    }
    /**
     * This method will preform Save and Exit for New aresources
     */
    public void SaveAndExitNewResources() throws InterruptedException
    {
        Log.info("Inside Method 'SaveAndExitNewResources()'");
        saveResource();
        Thread.sleep(3000);
        exitBuilder();
    }
    /**
     * method to save only the resource
     */
    public void saveResource() throws InterruptedException
    {
        Log.info("Inside Method 'saveResource()'");
        builderNavigation.click();
        Thread.sleep(3000);
        btnResourceSave.click();
        Thread.sleep(3000);
    }

    /**
     * method to exit the builder
     */
    public void exitBuilder() throws InterruptedException
    {
        Log.info("Inside Method 'exitBuilder()'");
        builderNavigation.click();
        Thread.sleep(3000);
        btnExitBuilder.click();
        Thread.sleep(3000);
    }
    /** This Method will create Old type of resource
     *  Creation includes Title updation, Save and Exit and check in My resources
     *  @param resourceName
     **/
    public void createNewResourceOld(Resources resourceName) throws InterruptedException
    {
        Log.info("Inside Method 'createNewResourceOld()' for resource "+resourceName);
        btnNewResource.click();
        Thread.sleep(2000);
        selectResourceFromNewButton(resourceName);
        Thread.sleep(2000);
        // handleVideoPopUp();
        txtTitleOldResource.click();
        txtTitleOldResource.clear();
        txtTitleOldResource.sendKeys("New Title"+resourceName);
        //SaveAndExitOldResources();
    }


    public void SaveAndExitOldResources() throws InterruptedException
    {
        Log.info("Inside Method 'SaveAndExitOldResources()'");
        btnSaveItemBank.click();
        btnExitItemBank.click();
        Thread.sleep(3000);
     //   btnConfirmYes.click();

    }

    /**
     * This method will Upload FIle to My Resource
     */
    public void FileUpload() throws InterruptedException, AWTException {
        Log.info("Inside Method 'FileUpload()'");
        btnNewResource.click();
        Thread.sleep(20000);
        lnkFileUpload.click();

        // switch to the file upload window
       // Alert alert = driver.switchTo().alert();
        String myWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(myWindowHandle);

        //String path="D:\\Devyani_POC - browsestack\\src\\main\\resources\\Flower.jpg";
        StringSelection ss = new StringSelection("D:\\Devyani_POC - browsestack\\src\\main\\resources\\Flower.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        // enter the filename

        // hit enter
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        // switch back
        driver.switchTo().activeElement();
    }

}