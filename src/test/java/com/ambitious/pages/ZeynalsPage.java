package com.ambitious.pages;

import com.ambitious.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeynalsPage {

    public ZeynalsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/a[2]")
    public WebElement bED;

    @FindBy(xpath = "//*[@id ='top_menu']/li[10]/a/b")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id=\"login\"]")
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[6]/a/span")
    public WebElement invButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[1]/li[2]/a/span")
    public WebElement invAdj;

    @FindBy(xpath = "//button[@accesskey = \"c\"]")
    public WebElement createButton;

    @FindBy(xpath = "//input[@class = \"o_field_char o_field_widget o_input o_required_modifier\"]")
    public WebElement InvRef;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[2]/div[3]/table[1]/tbody/tr[2]/td[2]/div/div[4]/label")
    public WebElement SelectProdMan;

    @FindBy(xpath = "//*[@id=\"o_field_input_149\"]")
    public WebElement ForceAccountDate;

    @FindBy(xpath = "//button[@class = \"btn btn-primary btn-sm o_form_button_save\"]")
    public WebElement saveButton;

}
