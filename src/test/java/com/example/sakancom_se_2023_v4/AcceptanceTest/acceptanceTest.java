package com.example.sakancom_se_2023_v4.AcceptanceTest;

import io.cucumber.junit. Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner. RunWith;
import io.cucumber.junit. CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "cases", monochrome= true, snippets = SnippetType.CAMELCASE,  glue= {"com.example.software.AcceptanceTest"})
//
public class acceptanceTest {



}
