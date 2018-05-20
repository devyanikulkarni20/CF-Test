package pageobjects;
import core.CoreTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPageObject extends CoreTest
{
  //  WebDriver driver;

    @FindBy (name="account")
    WebElement userName;

    @FindBy(name="password")
    WebElement UserPassword;

    @FindBy(css=".auth-button")
    WebElement role_teacher_login;

    @FindBy(className="button")
    WebElement Teacher_login;

    @FindBy(linkText = "Register here.")
    WebElement RegisterHere;

    @FindBy(css = "#root > div > div > div.registrationpage.identity > div.signin-wrapper > div.roleselection.auth-container.w-selection.mod-light > div > div > button.auth-button.button.button-primary.green")
    WebElement role_Student_login;

    public LoginPageObject(RemoteWebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String strUserName)
    {
        userName.sendKeys(strUserName);
    }
    public void setPassword(String strPassword)
    {
        UserPassword.sendKeys(strPassword);
    }
    public void clickLogin()
    {
        Teacher_login.click();
    }
    public void SelectTeacherLogin()
    {
        role_teacher_login.click();
    }
    public void clickOnRegisterHere()
    {
        RegisterHere.click();
    }
    public void SelectStudentLogin()
    {
        role_Student_login.click();
    }
}