package com.shankrish;

import java.util.logging.Logger;

public class Car {
    private static final Logger logger = Logger.getLogger(Car.class.getName());
    private Engine engine;

    // Constructor injection
    public Car(Engine engine) {
        this.engine = engine;
        logger.info("Car object done...");
    }

    public void drive() {
        engine.start();
        logger.info("Car is driving...");
    }

}
