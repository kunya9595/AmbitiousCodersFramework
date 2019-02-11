package com.ambitious.pages;

import com.ambitious.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/web#menu_id=378&action=521']")
       public WebElement productBttn;

    @FindBy(xpath = "//div[@class='oe_kanban_global_click o_kanban_record']")
    public WebElement appleWireless;

    @FindBy(xpath = "//div[@class='o_notebook']")
    public WebElement productInformation;
}