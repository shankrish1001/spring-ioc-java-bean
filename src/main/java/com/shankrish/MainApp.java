package com.shankrish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class MainApp {
    private static final Logger logger = Logger.getLogger(MainApp.class.getName());
    public static void main(String[] args) {
        logger.info("MainApp - Begin");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car myCar = context.getBean(Car.class);
        myCar.drive();
        logger.info("MainApp - End");
    }
}
