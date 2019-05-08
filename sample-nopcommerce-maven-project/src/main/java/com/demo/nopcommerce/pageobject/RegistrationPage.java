package com.demo.nopcommerce.pageobject;

import com.demo.nopcommerce.utility.Util;
import org.openqa.selenium.By;

public class RegistrationPage extends Util {

    By registrationText = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1");

    By genderRadioBtn = By.id("gender-female");

    By firstName = By.id("FirstName");

    By lastName = By.id("LastName");

    By dateOfBirth = By.name("DateOfBirthDay");

    By monthOfBirth = By.name("DateOfBirthMonth");

    By yearOfBirth = By.name("DateOfBirthYear");

    By emailField = By.id("Email");

    By passwordField = By.id("Password");

    By confirmPassword = By.id("ConfirmPassword");

    By registrationBtn = By.id("register-button");


    public String getRegistrationTextName() {
        return getTextFromElement(registrationText);
    }

    public void clickOnGenderRadioButton() {
        clickOnElement(genderRadioBtn);
    }

    public void enterFirstName(String finame) {
        sendTextToElement(firstName, finame);
    }

    public void enterLastName(String lstname) {
        sendTextToElement(lastName, lstname);
    }

    public void enterDateOfBirth(String dob) {
        sendTextToElement(dateOfBirth, dob);
    }

    public void enterMonthOfBirth(String mot) {
        sendTextToElement(monthOfBirth, mot);
    }

    public void enterYearOfBirth(String years) {
        sendTextToElement(yearOfBirth, years);
    }

    public void enterEmailField(String email) {
        sendTextToElement(emailField, email);
    }

//     public String randomEmail() {
//        return ("mahi1234"+generateRandomNumber()+"gmail.com");
//    }

    public void enterPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confPassword) {
        sendTextToElement(confirmPassword, confPassword);
    }

    public void clickOnRegistration() {
        clickOnElement(registrationBtn);
    }


}
