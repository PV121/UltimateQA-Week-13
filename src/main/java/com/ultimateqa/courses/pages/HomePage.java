package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By sign= By.linkText("Sign In");
    By title=By.xpath("//h1[@class='page__heading']");

    public void clickOnLoginBtn(){
        clickOnElement(sign);
    }
    public String verifyWelcomeText(){
        return getTextFromElement(title);
    }
}
