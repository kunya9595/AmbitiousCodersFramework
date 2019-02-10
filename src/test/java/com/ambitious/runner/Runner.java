package com.ambitious.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber",
        "json:target/default-json-cucumber.json"},
        features = "src/test/resources/features",
        glue = "com.ambitious.steps",
        tags = "@smoke",
        dryRun = false



)



public class Runner {



}
