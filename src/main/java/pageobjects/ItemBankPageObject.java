package pageobjects;

import core.CoreTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ItemBankPageObject extends CoreTest
    {
        // WebDriver driver;
        @FindBy (className = "edit.button.button-primary")
        WebElement btnEditItemBank;

        public ItemBankPageObject(RemoteWebDriver driver)
        {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void editItemBank()
        {
            Log.info("Inside Method 'editItemBank()'");

            WebElement ItemList = driver.findElement(By.cssSelector(".cf-list.resources.k-widget.k-listview.k-selectable"));
            List<WebElement> list = ItemList.findElements(By.cssSelector(".item"));
            list.get(0).click();
            btnEditItemBank.click();
       }



}
