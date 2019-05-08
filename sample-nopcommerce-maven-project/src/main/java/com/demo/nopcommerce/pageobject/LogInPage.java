package com.demo.nopcommerce.pageobject;

import com.demo.nopcommerce.utility.Util;
import org.openqa.selenium.By;

public class LogInPage extends Util {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    By emailField = By.id("Email");

    By passwordField = By.name("Password");

    By loginBtn = By.xpath("//input[@value='Log in']");


     public void enterEmailAddress ( String email ) {

     sendTextToElement(emailField, email);
     }

     public void enterPassword ( String password ){

     sendTextToElement( passwordField, password );
     }
     public void clickOnLogInButton(){

         clickOnElement(loginBtn);
     }

     public String getWelcomeText (){

         return getTextFromElement(welcomeText);
     }


}
