package core;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pageobjects.HomePageObject;
import pageobjects.LoginPageObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class CoreTest
{
    public RemoteWebDriver driver;
    //public WebDriver driver;
    public static String BS_USERNAME="devyanikulkarni2";
    public static String BS_PASSWORD="GjH1chYViq4xVngdpLbS";
    public static String BS_URL="https://"+BS_USERNAME+":"+BS_PASSWORD+"@hub.browserstack.com/wd/hub";

    //log4j
    public static Logger Log = Logger.getLogger(CoreTest.class.getName());

    //declaration for Extent reports

    public ExtentReports extent;
    public ExtentTest test;

   @BeforeSuite(alwaysRun = true)
   //@BeforeTest
   public void setup() throws InterruptedException, MalformedURLException
   {
       System.out.println("Inside Before Suit");
       DOMConfigurator.configure("log4j.xml");

       extent = new ExtentReports("D:\\Devyani_POC - browsestack\\Results\\Reports\\automationreport.html", true);
       //extent.loadConfig(new File(""));

       //Broswerstack code
       DesiredCapabilities capability = new DesiredCapabilities();
       capability.setPlatform(Platform.WIN8);
       capability.setBrowserName("chrome");
       capability.setVersion("66");
       URL browserStackURL = new URL(BS_URL);
       driver =new RemoteWebDriver(browserStackURL,capability);

       // System.setProperty("webdriver.chrome.driver", "D:\\Devyani_POC\\drivers\\chromedriver.exe");
       // driver = new ChromeDriver();

       //driver.get("https://classflowqa2.prometheanjira.com/classflow/#!/");
       driver.get("https://prod.classflow.com/classflow/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       //Thread.sleep(3000);

       LoginPageObject objLogin = new LoginPageObject(driver); //Create Login Page object
       HomePageObject objHomePage = new HomePageObject(driver);  //Create Home Page object

       objLogin.SelectTeacherLogin();
       objLogin.setUserName("devyani");
       objLogin.setPassword("123devyani");
       Thread.sleep(3000);
       objLogin.clickLogin();
       Thread.sleep(5000);
       Assert.assertEquals("ClassFlow", driver.getTitle());
   }

   @BeforeMethod(alwaysRun = true)
    public void beforeMethod()
    {
        System.out.println("Inside Before Method");
            }

   @AfterMethod(alwaysRun = true)
    public void AfterMethod()
   {
       System.out.println("Inside After Method");
   }


    @AfterSuite(alwaysRun = true)
    public void AfterSuite()
    {
        System.out.println("Inside After Suit");
        extent.endTest(test);
        extent.flush();
        driver.close();
    }

}
