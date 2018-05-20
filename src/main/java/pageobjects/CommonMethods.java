package pageobjects;

import core.CoreTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;

public class CommonMethods extends CoreTest
{

    /**
     * It will capture the ScreenShot
     * @param driver
     */
    public static String takeSnapShot(RemoteWebDriver driver)
    {
        // Take screenshot and store as a file format

        String fileName = String.valueOf(System.currentTimeMillis());
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
            String ScreenShotsPath = System.getProperty("user.dir");
            ScreenShotsPath = ScreenShotsPath + "\\results\\ScreenShots";

            // now copy the  screenshot to desired location using copyFile method
            FileUtils.copyFile(src, new File( ScreenShotsPath + "\\" + fileName+".png"));
            Log.info("Captured image is " + fileName + ".png");
        }

        catch (Exception e)
        {

        }

        return fileName;
    }


}