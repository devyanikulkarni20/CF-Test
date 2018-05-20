package pageobjects;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageObject extends CommonMethods
{
   // WebDriver driver;

    @FindBy(name="Resources")
    WebElement tabMyResource;

    @FindBy(name="Classes")
    WebElement tabClasses;

    @FindBy(name="Home")
    WebElement tabHome;

    @FindBy(name="Marketplace")
    WebElement tabMarketplace;


    String expected_TitleHomePage = "ClassFlow";

    public HomePageObject(RemoteWebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * This method will help to navigate to My Resources Page
     * @throws Exception
     */
    public void navigateToMyResourcePage() throws Exception
    {
        Log.info("Inside Method 'navigateToMyResourcePage'");
        tabMyResource.click();
        Assert.assertEquals("ClassFlow - Resources", driver.getTitle());
    }

    /**
     * This method will help to navigate to Classes
     * @throws Exception
     */
    public void navigateToClassesPage() throws Exception
    {
        Log.info("Inside Method 'navigateToClassesPage()'");
        tabClasses.click();
        Assert.assertEquals("ClassFlow - Classes", driver.getTitle());
    }
    /**
     * This method will help to navigate to Classes
     * @throws Exception
     */
    public void navigateToHomePage() throws Exception
    {
        Log.info("Inside Method 'navigateToHomePage()'");
        tabHome.click();
        Assert.assertEquals("ClassFlow", driver.getTitle());
    }
    /**
     * This method will help to navigate to Marketplace
     * @throws Exception
     */
    public void navigateToMrketplacePage() throws Exception
    {
        Log.info("Inside Method 'navigateToMrketplacePage()'");
        tabMarketplace.click();
        Assert.assertEquals("Lesson Marketplace", driver.getTitle());
    }

}