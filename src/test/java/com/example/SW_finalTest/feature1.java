package com.example.SW_finalTest;

import com.example.sw_final.TESTINPUT;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class feature1 {

    @When("user click on insert house and flag is {string}")
    public void userClickOnInsertHouseAndFlagIs(String string) {
        assertTrue(string.equals("true"));

    }
    @Then("all field should be with {string}")
    public void allFieldShouldBeWith(String string) {
        assertTrue(string.equals("error"));

    }
    //successful


    @When("he fill in {string} with {string}")
    public void heFillInWith(String string, String string2) {
        if(string.equals("Services")){
            assertTrue(TESTINPUT.houseServicesTest(string2));
        }
        else if (string.equals("Price")) {
            assertTrue(TESTINPUT.priceTest(string2));
        }
        else if (string.equals("Bedroom")) {
            assertTrue(TESTINPUT.houseBedroomTest(string2));
        }
        else if (string.equals("Bathroom")) {
            assertTrue(TESTINPUT.houseBathroomTest(string2));
        }
        else if(string.equals("Balcony")){
            assertTrue(TESTINPUT.houseBalconyTest(string2));
        }

        else  if(string.equals("housenumber")){
            assertTrue(TESTINPUT.houseNumbertest(string2));
        }
    }
    @When("he fill in {string} with extension {string}")
    public void heFillInWithExtension(String string, String string2) {
        assertTrue(TESTINPUT.housePictureTest(string2));
    }
    @When("he presses {string} and flag is {string}")
    public void hePressesAndFlagIs(String string, String string2) {
        assertTrue(string2.equals("true"));
    }
    @Then("show massage {string}")
    public void showMassage(String string) {
        assertTrue(string.equals("information has been entered successfully"));
    }


    //error

    @When("he fill in {string} with the {string}")
    public void heFillInWithThe(String string, String string2) {
        assertFalse(TESTINPUT.testfail(string,string2));
    }

    @When("he fill in {string} with the extension {string}")
    public void heFillInWithTheExtension(String string, String string2) {
        assertFalse(TESTINPUT.housePictureTest(string2));

    }
    @Then("the user should see {string}")
    public void theUserShouldSee(String string) {
assertTrue(string.equals("price must be more than 0") || string.equals("Bedroom must be more than 0")||string.equals("Bathroom must be more than 0") ||
        string.equals("Price must  be Positive") ||string.equals("Bedroom must  be Positive") ||string.equals("Bathroom  must  be Positive") ||
        string.equals("Balcony  must  be Positive") || string.equals("The extension of picture should be png" )||
        string.equals("The Number of house should be 7 bits 2 of Apartment Building number,2 of floor number, 3 for  apartment  number")
||string.equals("services shouldnt contan integer"));
    }



}
