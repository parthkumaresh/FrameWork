package com.demo.nopcommerce.testbase;

import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.browerselector.BrowserSelector;
import com.demo.nopcommerce.properties.LoadProperties;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;


public class TestBase extends BasePage {
    BrowserSelector browserSelectorrowser = new BrowserSelector();
    LoadProperties loadProperties = new LoadProperties();

    String browsers = loadProperties.getProperty("browser");
    String baseUrl = loadProperties.getProperty("baseUrl");
    String time = loadProperties.getProperty("time");


    @BeforeMethod
    public void setUp() {

        browserSelectorrowser.selectBrowser(browsers);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

