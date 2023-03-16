package com.symund.pages;

import com.symund.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="user")
    public WebElement username;
    @FindBy(id="password")
    public WebElement password;
    @FindBy(id="submit-form")
    public WebElement click;
    @FindBy(xpath = "//img[@width='32']")
    public WebElement profilIcon;
    @FindBy(xpath = "//span[@title='Employee170']")
    public WebElement profilIconVerify;
    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement WrongMessage;
    @FindBy(xpath = "//img[@alt='Toggle password visibility']")
    public WebElement passwordEye;
    @FindBy(id="lost-password")
    public WebElement forgotPassword;
    @FindBy(xpath ="//input[@id='reset-password-submit']" )
    public WebElement resetPassword;

}
