package pageobjects;

import core.CoreTest;
import enums.ClassType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static enums.ClassType.StudentGenerated;

public class ClassesPageObject extends CoreTest
    {
        //WebDriver driver;

        @FindBy(css = "button.button.button-primary.add.add-class")
        private WebElement btnNewClass;

        @FindBy(name="Add a Class")
        private WebElement lnkAddClass;

        @FindBy(xpath = "//input[@placeholder = 'Please enter a class name']")
        private WebElement txtClassTitle;

        @FindBy(id = "rw_1_input")
        private WebElement txtClassSubject;

        @FindBy(id="rw_2_input")
        private WebElement txtClassGrade;

        @FindBy(css = "li[class='item class-type-info display-info'] button")
        private WebElement sectionStuClassFeatures;

        @FindBy(css = "li[class='item class-type-info'] button")
        private WebElement sectionTeacherClassFeatures;

        @FindBy(className = "middle-right-container")
        private WebElement divscrollBar;

        //public MyResourcePageObject(WebDriver driver)
        public ClassesPageObject(RemoteWebDriver driver)
        {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        /**
         * This method will help to click on New Class Button
         * @throws InterruptedException
         */
        public void clickOnNewClassButton() throws InterruptedException
        {
            Log.info("Inside Method 'clickOnNewClassButton()'");

            List<WebElement> createClass = driver.findElements(By.cssSelector("button.button.button-primary.add.add-class"));
            //Based on Setting the AddClass button is displayed as either "New" or "Add a Class"
            if (createClass.get(0).isDisplayed())
            {
                //Click on Add a Class
                btnNewClass.click();
                lnkAddClass.click();
            }
            else
            {
                //Click on New button
                createClass.get(1).click();
                //Click on "Add a Class" link
                lnkAddClass.click();
            }
        }

        /**
         * This Method will help to Create New Class
         * @param ctype
         * @throws InterruptedException
         */
        public void createNewClass(ClassType ctype) throws InterruptedException
        {
            Log.info("Inside Method 'createNewClass()'");

            txtClassSubject.click();
            txtClassSubject.sendKeys("English");
            txtClassGrade.click();
            txtClassGrade.sendKeys("1");
            if(ctype== StudentGenerated)
            {
                txtClassTitle.click();
                txtClassTitle.sendKeys("SGClass");
                sectionStuClassFeatures.click();
                Thread.sleep(50000);
            }
            else
            {
                txtClassTitle.click();
                txtClassTitle.sendKeys("TGClass");
                sectionTeacherClassFeatures.click();
                Thread.sleep(50000);
            }
        }
    }