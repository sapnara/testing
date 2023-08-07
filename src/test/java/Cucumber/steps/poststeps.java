package Cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class poststeps{
                @Given("User should be logged in and  should be present at  its own wall")
                public void userShouldBeLoggedInAndShouldBePresentAtItsOwnWall() {
                        System.out.println("userShouldBeLoggedInAndShouldBePresentAtItsOwnWall2");
                }
                @When("I type the message as {string}in the textbox")
                public void iTypeTheMessageAsInTheTextbox(String arg0) {
                }

                @And("Click on Post button")
                public void clickOnPostButton() {
                }

                @Then("The message should get posted")
                public void theMessageShouldGetPosted() {
                }

                @When("User supply the youtube link as {string} in the textbox")
                public void userSupplyTheYoutubeLinkAsInTheTextbox(String arg0) {
                }

                @Then("Then video should have proper thumbnail.")
                public void thenVideoShouldHaveProperThumbnail() {
                }
        }


