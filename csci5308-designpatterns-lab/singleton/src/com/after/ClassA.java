package com.after;

public class ClassA {
    private SingletonLogger logger;

    public ClassA(){
        logger = SingletonLogger.getInstance();
        System.out.println("Logger instance - " + logger);
        logger.info("This is an info statement.");
    }
}
