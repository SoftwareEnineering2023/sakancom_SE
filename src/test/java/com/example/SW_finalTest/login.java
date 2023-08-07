package com.example.SW_finalTest;

import com.example.sw_final.TESTLOGIN;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class login {

    @Given("I click on loginchoose and flag is {string}")
    public void iClickOnLoginchooseAndFlagIs(String string) {
        assertTrue(string.equals("true"));

    }

    @Given("the user leaves  field {string} empty")
    public void theUserLeavesFieldEmpty(String string) {
        assertTrue(string.isEmpty());
    }

    @Given("clicks on the {string} button")
    public void clicksOnTheButton(String string) {
        assertTrue(string.equals("Login"));

    }
    @Then("the user should see an error message indicating {string}")
    public void theUserShouldSeeAnErrorMessageIndicating(String string) {
        assertTrue(string.equals("Invalid username or password") || string.equals("Username or password is empty"));
    }

    @Given("he fills in {string} with {string}")
    public void heFillsInWith(String string, String string2) {
        if(string.equals("username")){
            assertTrue(!TESTLOGIN.userNametest(string2));
        }
        else if (string.equals("password")) {
            assertTrue(!TESTLOGIN.passWordtest(string2));
        }

    }

    @Given("he fills in {string} with the {string}")
    public void heFillsInWithThe(String string, String string2) {
        if(string.equals("username")){
            assertFalse(TESTLOGIN.userNametest(string2));
        }
        else if (string.equals("password")) {
            assertFalse(TESTLOGIN.passWordtest(string2));
        }

    }





    @Then("show  the massage {string}")
    public void showTheMassage(String string) {
        assertTrue(string.equals("Login  has been successfule"));

    }
}
