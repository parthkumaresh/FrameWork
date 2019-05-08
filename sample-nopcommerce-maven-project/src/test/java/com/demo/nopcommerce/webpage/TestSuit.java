package com.demo.nopcommerce.webpage;

import com.demo.nopcommerce.pageobject.*;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends TestBase {
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
    public void userShouldLogInSuccessfully() {
        homePage.clickOnLogInLink();
        logInPage.enterEmailAddress("mahi1234@gmail.com");
        logInPage.enterPassword("12345hi");
        logInPage.clickOnLogInButton();
    }

    @Test
    public void userShouldNaviagteToRegistrationPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String actualText = registrationPage.getRegistrationTextName();
        String expectedText = "Register";
        Assert.assertEquals(actualText, expectedText);
        registrationPage.clickOnGenderRadioButton();
        registrationPage.enterFirstName("Minal");
        registrationPage.enterLastName("Patel");
        registrationPage.enterDateOfBirth("7");
        registrationPage.enterMonthOfBirth("August");
        registrationPage.enterYearOfBirth("1986");
        registrationPage.enterEmailField("mahi1234@gmail");
        registrationPage.enterPasswordField("12345hello");
        registrationPage.enterConfirmPassword("12345hello");
        registrationPage.clickOnRegistration();


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