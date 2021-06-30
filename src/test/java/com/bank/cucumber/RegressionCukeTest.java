package com.bank.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"pretty","html:target/cucumber-report/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html",
                "json:target/RunCuke/cucmber.json"},
        tags = "@Regression"
)

public class RegressionCukeTest {

    @AfterClass
    public static void  setUp(){
        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = projectPath + "/src/test/java/resources/extentreport/extent-config.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone",System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine","Windows 10"+ "64 Bit");
        Reporter.setSystemInfo("selenium", "3.141.59");
        Reporter.setSystemInfo("maven", "3.5.9");

    }

}
