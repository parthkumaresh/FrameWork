package com.demo.nopcommerce.webpage;

import com.demo.nopcommerce.pageobject.ComputerPage;
import com.demo.nopcommerce.pageobject.DesktopsPage;
import com.demo.nopcommerce.pageobject.HomePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopTest extends TestBase {

    DesktopsPage desktopsPage = new DesktopsPage();
    ComputerPage computerPage = new ComputerPage();
    HomePage homePage = new HomePage();


    @Test
    public void userShouldNavigateToDesktopPageSuccessfully() {
        homePage.clickOnComputer();
        computerPage.clickOnDesktopField();
        String actualText = desktopsPage.getdeskTopsNameText();
        String expectedText = "Desktops";
        Assert.assertEquals(actualText, expectedText);
        desktopsPage.clickOnsorttedBy();
        String actualTextA = desktopsPage.getZTAName();
        String expectedTextB = "Name: Z to A";
        Assert.assertEquals(actualTextA, expectedTextB);
        desktopsPage.selectTheProduct();
        desktopsPage.addToBasket();
        String actualTextC = desktopsPage.getBuildYourOwnComputerName();
        String expectedTextD = "shopping cart";
        Assert.assertEquals(actualTextC, expectedTextD);
        desktopsPage.addToPopUp();
        desktopsPage.goOnShoppingList();
        desktopsPage.tickTheRadioBtn();
        desktopsPage.tillPay();

    }
}
