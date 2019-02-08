package com.ambitious.steps;

import com.ambitious.pages.ZeynalsPage;
import com.ambitious.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.Keys;

public class ZeynalsSteps {

    ZeynalsPage zpobj = new ZeynalsPage();

    @Given("User is on the home page {string},")
    public void user_is_on_the_home_page(String url) {
        url = "http://52.39.162.23";
        Driver.getDriver().get(url);

    }

    @Given("Click BriteErpDemo,")
    public void click_BriteErpDemo() throws InterruptedException {
        zpobj.bED.click();

        Thread.sleep(2000);
    }

    @Given("Click Sign in button,")
    public void click_Sign_in_button() {
        zpobj.signIn.click();
    }

    @Given("Enter email ,")
    public void enter_email() {
       zpobj.email.sendKeys("in@info.com");
    }

    @Given("Enter password,")
    public void enter_password() throws InterruptedException {
        zpobj.password.sendKeys("alsfuh7we67", Keys.ENTER);
        Thread.sleep(2000);
    }

    @Given("click Log in")
    public void click_Log_in() {
        //zpobj.loginButton.click();

        zpobj.invButton.click();
    }

    @Then("Click Inventory button")
    public void click_Inventory_button() {
        zpobj.invButton.click();
    }

    @Then("Click Inventory Adjustment under Operations")
    public void click_Inventory_Adjustment_under_Operations() {
        zpobj.invAdj.click();
    }

    @Then("Click Create button")
    public void click_Create_button() {
        zpobj.createButton.click();
    }

    @Then("Enter Inventory Reference")
    public void enter_Inventory_Reference() throws InterruptedException {
        zpobj.InvRef.sendKeys("Albali");
        Thread.sleep(2000);
    }

    @Then("Choose Select products manually")
    public void choose_Select_products_manually() {
        zpobj.SelectProdMan.click();
    }

    @Then("Enter Date {string}")
    public void enter_Date(String date) {
        date = "05/04/2019";
        zpobj.ForceAccountDate.click();
                zpobj.ForceAccountDate.sendKeys(date);
    }

    @Then("Click Save button")
    public void click_Save_button() {
        zpobj.saveButton.click();
    }
}
