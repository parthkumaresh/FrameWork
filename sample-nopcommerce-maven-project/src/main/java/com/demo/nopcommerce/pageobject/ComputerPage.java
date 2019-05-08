package com.demo.nopcommerce.pageobject;

import com.demo.nopcommerce.utility.Util;
import org.openqa.selenium.By;

public class ComputerPage extends Util {

By computerText = By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[1]/h1");

By desktopTab = By.xpath("/html/body/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/ul/li[1]/ul/li[1]/a");



     public String computerTextName (){
         return getTextFromElement(computerText);
     }

     public void clickOnDesktopField (){
         clickOnElement(desktopTab);
     }


     }
