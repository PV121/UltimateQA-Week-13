package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    By username=By.id("user[email]");
    By password=By.id("user[password]");
    By signInBtn=By.xpath("//input[@type='submit']");
    By title=By.className("form-error__list-item");

    public void enterUserName(String name){
        sendTextToElement(username,name);
    }
    public void enterPassword(String pass){
        sendTextToElement(password,pass);
    }
    public void clickOnSIgnBtn(){
        clickOnElement(signInBtn);
    }
    public String verifyErrorMessage(){
        return getTextFromElement(title);
    }
}
