package com.ambitious.steps;

import com.ambitious.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().fullscreen();


    }



    @After
    public void tearDown(Scenario scenario ){
        // only takes a screenshot if the scenario fails
        if(scenario.isFailed()){
            //take a screenshot
            final byte[] screenshot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //adding the screenshot to the report
            scenario.embed(screenshot,"image/png");
        }

        Driver.closeDriver();
    }
}
