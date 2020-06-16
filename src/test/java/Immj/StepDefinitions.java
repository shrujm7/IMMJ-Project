package Immj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    Computers comp = new Computers();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {

    }

    @When("User click on add new computer")
    public void user_click_on_add_new_computer() {
        comp.addComputer();

    }

    @When("fill all details and click on submit button")
    public void fill_all_details_and_click_on_submit_button() {
        comp.fillDetails();

    }

    @Then("User successfully added computer")
    public void user_successfully_added_computer() {
    comp.successMessage();
    }

    @When("User searches for the computer to be edited")
    public void user_searches_for_the_computer_to_be_edited() {
        comp.searchComputer();

    }

    @When("selects the computer")
    public void selects_the_computer() {
    comp.selectEditComputer();
    }

    @When("edits the Introduced Date to {string}")
    public void edits_the_Introduced_Date_to(String RevIntroDate) {
        comp.editComputer(RevIntroDate);

    }

    @Then("User is able to save changes successfully")
    public void user_is_able_to_save_changes_successfully() {
        comp.saveComputerEdit();

    }

    @When("User searches for the computer to be deleted")
    public void user_searches_for_the_computer_to_be_deleted() {
        comp.searchComputerToDelete();
    }

    @When("selects it")
    public void selects_it() {
        comp.selectComputerToDelete();
    }


    @When("User clicks on delete computer button")
    public void user_clicks_on_delete_computer_button() {
        comp.clickDeleteButton();
    }

    @Then("User is able to delete computer successfully")
    public void user_is_able_to_delete_computer_successfully() {
        comp.successDeleteMessage();

    }



}
