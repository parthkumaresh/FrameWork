package com.demo.nopcommerce.browerselector;

import com.demo.nopcommerce.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends BasePage {
    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mitul\\IdeaProjects\\sample-nopcommerce-maven-project\\src\\test\\java\\com\\demo\\nopcommerce\\resources\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mitul\\IdeaProjects\\sample-nopcommerce-maven-project\\src\\test\\java\\com\\demo\\nopcommerce\\resources\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "resources\\drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Wrong Browser Selected");
        }


    }
}
