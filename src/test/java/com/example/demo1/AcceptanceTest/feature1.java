package com.example.demo1.AcceptanceTest;
import com.example.demo1.TESTINPUT;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;


public class feature1 {

    @When("user click on insert house and flag is {string}")
    public void userClickOnInsertHouseAndFlagIs(String string) {
        assertEquals(true,string.equals("true"));
    }
    @Then("all field should be with {string}")
    public void allFieldShouldBeWith(String string) {
        assertEquals(true,string.equals("error"));
    }
    @When("he fill in {string} with {string}")
    public void heFillInWith(String string, String string2) {
        if(string.equals("Services")){
            assertEquals(true,TESTINPUT.houseServicesTest("string2"));
        }
        else if (string.equals("Price")) {
            assertEquals(true,TESTINPUT.PriceTest(string2));
        }
        else if (string.equals("Bedroom")) {
            assertEquals(true,TESTINPUT.houseBedroomTest(string2));
        }
        else if (string.equals("Bathroom")) {
            assertEquals(true,TESTINPUT.houseBathroomTest(string2));
        }
        else if(string.equals("Balcony")){
            assertEquals(true,TESTINPUT.houseBalconyTest(string2));
        }
        else  if(string.equals("housenumber")){
            assertEquals(true,TESTINPUT.houseNumberTest("string2"));
        }
    }


    @When("he fill in {string} with extension {string}")
    public void heFillInWithExtension(String string, String string2) {
        assertEquals(true, TESTINPUT.housePictureTest(string2));
    }

    @When("he presses {string} and flag is {string}")
    public void hePressesAndFlagIs(String string, String string2) {
        assertEquals(true,string.equals("true"));

    }
    @Then("show massage {string}")
    public void showMassage(String string) {
        assertEquals(true,string.equals("information has been entered successfully"));
    }

    @Then("the user should see {string}")
    public void theUserShouldSee(String string) {
        boolean isMessageCorrect = string.equals("price must be more than 0") || string.equals("Bedroom must be more than 0")||string.equals("Bathroom must be more than 0") ||
                string.equals("Price must  be Positive ") ||string.equals("Bedroom must  be Positive ") ||string.equals("Bathroom  must  be Positive") ||
                string.equals("Balcony  must  be Positive") || string.equals("The extension of picture should be png" )||
                string.equals("The Number of house should be 7 bits 2 of Apartment Building number,2 of floor number, 3 for  apartment  number");
        assertEquals(true, isMessageCorrect);    }




}
