package com.demo.nopcommerce.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
    static Properties prop;

    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream("C:\\Users\\Mitul\\IdeaProjects\\sample-nopcommerce-maven-project\\src\\test\\java\\com\\demo\\nopcommerce\\resources\\configfile\\config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

}
