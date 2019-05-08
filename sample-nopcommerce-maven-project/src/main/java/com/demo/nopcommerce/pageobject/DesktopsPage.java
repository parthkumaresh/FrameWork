package com.demo.nopcommerce.pageobject;

import com.demo.nopcommerce.utility.Util;
import org.openqa.selenium.By;

public class DesktopsPage extends Util {
    By desktopsText = By.xpath("//h1[contains(text(),'Desktops')]");
    By sorted = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By zTOAName = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By levonoProduct = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[1]//a[1]//img[1]");
    By chartBasket = By.id("add-to-cart-button-3");
    By greenMessageText = By.xpath("//a[contains(text(),'shopping cart')]");
    By buildYourOwnText = By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingList = By.xpath("//span[@class='cart-label']");
    By tick = By.id("termsofservice");
    By till = By.name("checkout");



    public String getdeskTopsNameText() {
        return getTextFromElement(desktopsText);
    }

    public void clickOnsorttedBy() {
        clickOnElement(sorted);
    }

    public String getZTAName() { return getTextFromElement(zTOAName); }

    public void selectTheProduct() {
        clickOnElement(levonoProduct);
    }

    public void addToBasket() { clickOnElement(chartBasket); }

    public void addToPopUp() { clickOnElement(greenMessageText); }

    public String getBuildYourOwnComputerName() { return getTextFromElement(buildYourOwnText);}

    public void goOnShoppingList() {clickOnElement(shoppingList); }

    public void tickTheRadioBtn(){ clickOnElement(tick);}

    public void tillPay() { clickOnElement(till); }




}


