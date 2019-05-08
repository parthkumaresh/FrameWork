package com.demo.nopcommerce.webpage;

import com.demo.nopcommerce.pageobject.ComputerPage;
import com.demo.nopcommerce.pageobject.HomePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;
import org.testng.Assert;

public class ComputerTest extends TestBase {
    ComputerPage computerPage = new ComputerPage();
    HomePage homePage = new HomePage();


    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputer();
        String actualText = computerPage.computerTextName();
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText);

        computerPage.clickOnDesktopField();
    }
}
