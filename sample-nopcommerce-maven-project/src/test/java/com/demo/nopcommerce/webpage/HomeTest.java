package com.demo.nopcommerce.webpage;

import com.demo.nopcommerce.pageobject.*;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    LogInPage logInPage = new LogInPage();
    RegistrationPage registrationPage = new RegistrationPage();
    DesktopsPage desktopsPage = new DesktopsPage();


    @Test
    public void userShouldNavigateToLogInPageSuccessfully() {

        homePage.clickOnLogInLink();
        String actualText = logInPage.getWelcomeText();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void userShouldNavigateToRegistrationPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String actualText = registrationPage.getRegistrationTextName();
        String expectedText = "Register";
        Assert.assertEquals(actualText, expectedText);
    }


    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputer();
        String actualText = computerPage.computerTextName();
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void userShouldNavigateToDesktopPageSuccessfully() {
        homePage.clickOnComputer();
        computerPage.clickOnDesktopField();
        String actualText = desktopsPage.getdeskTopsNameText();
        String expectedText = "Desktops";
        Assert.assertEquals(actualText, expectedText);
    }


}