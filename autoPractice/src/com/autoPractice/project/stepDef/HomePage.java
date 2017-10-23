package com.autoPractice.project.stepDef;

import com.autoPractice.project.shared.WebDriverHandling;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomePage {
    @Given("^I navigated to home page$")
    public void iNavigatedToHomePage() throws Throwable {
        WebDriverHandling wh = new WebDriverHandling();
        System.out.println("hello111");
        wh.getDriverInstance("chrome");
        System.out.println("hell222o");
        wh.navigate();
    }

    @When("^I click on on \"([^\"]*)\" category$")
    public void i_click_on_on_category(String arg1) throws Throwable {

    }

    @Then("^I should see left side filters$")
    public void i_should_see_left_side_filters() throws Throwable {

    }
}
