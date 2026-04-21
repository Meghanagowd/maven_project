package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

/**
 * Main application class for the CI/CD Demo.
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        String name = "CI/CD Pipeline";

        if (StringUtils.isNotBlank(name)) {
            String message = greet(name);
            logger.info(message);
            // System.out.println is fine, but logger.info is better for CI/CD logs!
            System.out.println(message);
        } else {
            logger.error("Name is empty!");
        }
    }

    public static String greet(String name) {
        return "Hello, " + name + "! Welcome to Maven CI/CD Demo.";
    }
}   
