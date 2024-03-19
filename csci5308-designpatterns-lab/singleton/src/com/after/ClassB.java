package com.after;

public class ClassB {
    private SingletonLogger logger;

    public ClassB(){
        logger = SingletonLogger.getInstance();
        System.out.println("Logger instance - " + logger);
        logger.error("This is an error statement.");
    }
}
