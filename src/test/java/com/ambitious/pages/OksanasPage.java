package com.ambitious.pages;

import com.ambitious.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OksanasPage {

        WebDriver driver;
        public OksanasPage(){
            driver= Driver.getDriver();
            PageFactory.initElements(driver, this);

        }
        @FindBy(xpath="/html/body/div[1]/div/div[2]/a[2]")
        public WebElement briteerpButton;
        @FindBy(id="login")
        public WebElement email;
        @FindBy(id="password")
        public WebElement password;
        @FindBy(xpath="//*[@id=\"wrapwrap\"]/main/div/form/div[4]/button")
        public WebElement loginButton;
        @FindBy(xpath="//*[@id='oe_main_menu_navbar']/div[2]/ul[1]/li[6]/a/span")
        public WebElement inventoryModule;
        @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[6]/ul[3]/li[3]/a/span")
        public WebElement productMovesModule;
        @FindBy(xpath="//div//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']")
        public WebElement productTable;
        @FindBy(xpath="//table[1]//a[@name='product_id']")
        public WebElement productName;
        @FindBy(xpath="//div[5]//li//a[1]")
        public WebElement generalInformation;

    }


