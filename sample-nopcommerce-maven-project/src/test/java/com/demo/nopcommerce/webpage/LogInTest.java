package com.demo.nopcommerce.webpage;

import com.demo.nopcommerce.pageobject.HomePage;
import com.demo.nopcommerce.pageobject.LogInPage;
import com.demo.nopcommerce.pageobject.RegistrationPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {


    HomePage homePage = new HomePage();
    LogInPage logInPage = new LogInPage();
    RegistrationPage registrationPage = new RegistrationPage();

     @Test
     public void userShouldNavigateToLogInPageSuccessfully(){

        homePage.clickOnLogInLink();
        String actualText = logInPage.getWelcomeText();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals( actualText,expectedText);

     }


     @Test
     public void userShouldLogInSuccessfully(){
        homePage.clickOnLogInLink();
        logInPage.enterEmailAddress("mahi8@gmail.com");
        logInPage.enterPassword("12345hi");
        logInPage.clickOnLogInButton();
     }

//     @Test
//     public void userShouldNaviagteToRegistrationPagesSuccessfully(){
//         homePage.clickOnRegisterLink();
//         String actualText = registrationPage.getRegistrationTextName();
//         String expectedText = "Register";
//         Assert.assertEquals( actualText,expectedText);
//         registrationPage.clickOnGenderRadioButton();
//         registrationPage.enterFirstName("Minal");
//         registrationPage.enterLastName("Patel");
//         registrationPage.enterDateOfBirth("7");
//         registrationPage.enterMonthOfBirth("August");
//         registrationPage.enterYearOfBirth("1986");
//         registrationPage.enterEmailField("mahi1234@gmail");
//         registrationPage.enterPasswordField("12345hello");
//         registrationPage.enterConfirmPassword("12345hello");
//         registrationPage.clickOnRegistration();
//
//       }
//
//

         }
