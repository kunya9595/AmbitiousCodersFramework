package com.ambitious.steps;

import com.ambitious.pages.OksanasPage;
import com.ambitious.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OksanasSteps {
OksanasPage pp = new OksanasPage();




        @Given("User is on the BRITE ERP login page")
        public void user_is_on_the_BRITE_ERP_login_page() {
            Driver.getDriver().get("http:52.39.162.23");
            pp.briteerpButton.click();
        }
        @Given("User should enter valid email")
        public void user_should_enter_valid_email() {
            pp.email.sendKeys("in@info.com");

        }

        @Given("User should enter valid password")
        public void user_should_enter_valid_password() {
            pp.password.sendKeys("alsfuh7we67");

        }

        @Given("User should click Log In button")
        public void user_should_click_Log_In_button() {
            pp.loginButton.click();

        }

        @Then("User clicks Inventory")
        public void user_clicks_Inventory() {
            pp.inventoryModule.click();

        }

        @Then("User clicks Product Moves module")
        public void user_clicks_Product_Moves_module()
        {
            pp.productMovesModule.click();
        }

        @Then("User selects product from the Product Table")
        public void user_selects_product_from_the_Product_Table() {
            WebElement orderTable = pp.productTable;
            List<WebElement> allRows = orderTable.findElements(By.tagName("tr"));
            for (WebElement row : allRows) {
                List<WebElement> cosl = row.findElements(By.tagName("td"));
                for (WebElement col : cosl) {
                    String actualElememt = "[E-COM10] Apple Wireless Keyboard";
                    if (col.getText().equals(actualElememt)) {
                        col.click();
                    }


                }
            }
        }

        @When("User clicks Product Name")
        public void user_clicks_Product_Name() {
            Assert.assertTrue(pp.productName.isDisplayed());
            pp.productName.click();

        }

        @Then("User should verify General Information Table for the Product")
        public void user_should_verify_General_Information_Table_for_the_Product() {
            String verifycation = "General Information";
            Assert.assertEquals(pp.generalInformation.getText(),verifycation);
        }


    }


