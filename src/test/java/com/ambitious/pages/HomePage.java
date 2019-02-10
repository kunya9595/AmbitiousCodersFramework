package com.ambitious.pages;

import com.ambitious.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[.='Congratulations, your inbox is empty']")
    public WebElement message;

    @FindBy (xpath = "//a[@href='/web#menu_id=347&action=']")
    public WebElement inventoryBtnOnTheTop;


    @FindBy(xpath = "//a[@href='/web#menu_id=363&action=484']")
    public WebElement inventoryBtnUnderReport;

    @FindBy(xpath = "//label[.='Current Inventory']")
    public WebElement radioBtnCurrentInventory;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement retrieveBtn;


    @FindBy(xpath = "//th[.='Reserved']")
    public WebElement reservedBtn;

    @FindBy(xpath = "//tbody")
    public WebElement table;



}
