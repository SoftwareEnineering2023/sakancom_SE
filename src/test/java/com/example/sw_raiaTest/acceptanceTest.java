package com.example.sw_raiaTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
    @RunWith(Cucumber.class)
    @CucumberOptions(features = "case", monochrome= true,
            snippets = CucumberOptions.SnippetType.CAMELCASE,
            glue= {"com.example.sw_raiaTest"})


    public class acceptanceTest {

}
