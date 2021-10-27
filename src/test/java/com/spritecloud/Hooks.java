package com.spritecloud;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.spritecloud.core.DriverService;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        Logger.getRootLogger().info("-----------" + scenario.getName() + "-----------");
    }

    @After
    public void afterScenario(Scenario scenario) {
        Logger.getRootLogger().info(" ending -----------" + scenario.getName() + "-----------");
        /*
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot) DriverService
                    .getDriverInstance()).getScreenshotAs(OutputType.BYTES), "image/png");
            DriverService.dismissDriver();
        }
        */

        //DriverService.dismissDriver();
    }
}
