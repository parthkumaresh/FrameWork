package com.demo.nopcommerce.pageobject;

import com.demo.nopcommerce.utility.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {

    By loginLinlk = By.linkText("Log in");

    By registerLink = By.linkText( "Register");

    By computerLink = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");




    public void clickOnLogInLink (){
        clickOnElement(loginLinlk);

    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);

    }

    public void clickOnComputer (){
        clickOnElement(computerLink);
    }



}


