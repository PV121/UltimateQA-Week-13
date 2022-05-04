package com.ultimateqa.courses.testbase;


import com.ultimateqa.courses.propertyreader.PropertyReader;
import com.ultimateqa.courses.utility.Utility;
import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod// before method testng annotations
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod// after method testng annotations
    public void tearDown(){
        closeBrowser();
    }
}
