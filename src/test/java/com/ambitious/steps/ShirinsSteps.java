package com.ambitious.steps;

import com.ambitious.pages.HomePage;
import com.ambitious.pages.LoginPage;
import com.ambitious.pages.MainPage;
import com.ambitious.utilities.Config;
import com.ambitious.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.security.auth.login.Configuration;
import java.util.List;

public class ShirinsSteps {

    HomePage homePageObject = new HomePage();
    LoginPage loginPageObject = new LoginPage();
    MainPage mainPageObject = new MainPage();


    @Given("Manager goes to BriteErp.com main page")
    public void manager_goes_to_BriteErp_com_main_page() {

        Driver.getDriver().get(Config.getProperty("url"));


    }

    @Given("Manager chooses valid url and click")
    public void manager_chooses_valid_url_and_click() {

        mainPageObject.demoBtn.click();

    }

    @Given("Manager enters valid credentials and logs in")
    public void manager_enters_valid_credentials_and_logs_in() {

        loginPageObject.email.sendKeys(Config.getProperty("email"));
        loginPageObject.password.sendKeys(Config.getProperty("password"));
        loginPageObject.loginBtn.click();

    }

    @Then("Successful Message should appear")
    public void successful_Message_should_appear() {


        Assert.assertTrue(homePageObject.message.getText().equals(Config.getProperty("message")));

    }

    @Then("Manager should choose Inventory section")
    public void manager_should_choose_Inventory_section() {

        homePageObject.inventoryBtnOnTheTop.click();

    }

    @Then("Manager should choose under Reporting Inventory button and click")
    public void manager_should_choose_under_Reporting_Inventory_button_and_click() {

        homePageObject.inventoryBtnUnderReport.click();

    }

    @Then("Choose Current Inventory report")
    public void choose_Current_Inventory_report() {

        homePageObject.radioBtnCurrentInventory.click();

    }

    @Then("Click on Retrieve the Inventory Quantities")
    public void click_on_Retrieve_the_Inventory_Quantities() {

        homePageObject.retrieveBtn.click();

    }

    @Then("Press on Reserved button")
    public void press_on_Reserved_button() {

        homePageObject.reservedBtn.click();




    }


}
