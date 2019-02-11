package com.ambitious.steps;

import com.ambitious.pages.HomePage;
import com.ambitious.pages.LoginPage;
import com.ambitious.pages.MainPage;
import com.ambitious.pages.ProductPage;
import com.ambitious.utilities.Config;
import com.ambitious.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class MervesSteps {

    HomePage hm = new HomePage();
    LoginPage lp = new LoginPage();
    MainPage mp = new MainPage();
    ProductPage pp=new ProductPage();

    @Given("user goes to BriteErp.com main page")
    public void user_goes_to_BriteErp_com_main_page() {
        Driver.getDriver().get(Config.getProperty("url"));
    }

    @Given("user chooses valid url and click")
    public void user_chooses_valid_url_and_click() {
        mp.demoBtn.click();
    }

    @Given("user enters valid credentials and logs in")
    public void user_enters_valid_credentials_and_logs_in() {
        lp.email.sendKeys(Config.getProperty("userEmail"));
        lp.password.sendKeys(Config.getProperty("userPassword"));
        lp.loginBtn.click();
    }

    @Then("user should choose Inventory section")
    public void user_should_choose_Inventory_section() {
        hm.inventoryBtnOnTheTop.click();
    }

    @Then("user clicks the product tab.")
    public void user_clicks_the_product_tab() {
         pp.productBttn.click();
    }

    @Then("user select any random products from the product list.")
    public void user_select_any_random_products_from_the_product_list() {
        pp.appleWireless.click();
    }

    @Then("user can see the details of the selected product on the nex page.")
    public void user_can_see_the_details_of_the_selected_product_on_the_nex_page() {
        Assert.assertTrue(pp.productInformation.isDisplayed());
    }

}
