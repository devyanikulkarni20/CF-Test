package tests;

import com.relevantcodes.extentreports.LogStatus;
import core.CoreTest;
import org.testng.annotations.Test;
import pageobjects.HomePageObject;
import pageobjects.LoginPageObject;

public class LoginPageTest extends CoreTest
{
    //WebDriver driver;
    LoginPageObject objLogin;
    HomePageObject objHomePage;

    @Test
    public void LoginTest001_Login_As_Teacher() throws InterruptedException
    {

        test=extent.startTest("LoginTest001_Login_As_Teacher()");
        Log.info("Inside Test 'LoginTest001_Login_As_Teacher()'");

        objLogin = new LoginPageObject(driver); //Create Login Page object
        objHomePage = new HomePageObject(driver);  //Create Home Page object

        objLogin.SelectTeacherLogin();
        Thread.sleep(3000);
        objLogin.setUserName("autxp5");
        Thread.sleep(3000);
        objLogin.setPassword("Promethean1");
        Thread.sleep(3000);
        objLogin.clickLogin();
        Thread.sleep(3000);
        test.log(LogStatus.PASS, "Sucessfully Login to teacher account");
    }
}