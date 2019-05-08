package com.demo.nopcommerce.webpage;

import com.demo.nopcommerce.pageobject.HomePage;
import com.demo.nopcommerce.pageobject.RegistrationPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    HomePage homePage = new HomePage();

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
//        registrationPage.enterEmailField(registrationPage.randomEmail());
        registrationPage.enterEmailField("mahi1234@gmail");
        registrationPage.enterPasswordField("12345hello");
        registrationPage.enterConfirmPassword("12345hello");
        registrationPage.clickOnRegistration();


    }


}
