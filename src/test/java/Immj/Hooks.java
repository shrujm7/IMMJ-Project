package Immj;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp prop = new LoadProp();

    @Before

    public void setUPBrowser(){

        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://computer-database.herokuapp.com/computers");

    }

    @After

    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File scrFile = ts.getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(scrFile, new File("src\\test\\resources\\ScreenShots\\Screenshots" + System.currentTimeMillis() + ".png"));
                System.out.println("ScreenShot Taken");
            } catch (IOException e) {

                e.printStackTrace();
            }

        }}




    @After
    public void closeBrowser(){

        driver.close();

    }



}
