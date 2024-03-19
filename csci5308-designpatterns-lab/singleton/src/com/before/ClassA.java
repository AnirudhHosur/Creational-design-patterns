package com.before;

public class ClassA {
    private Logger logger;

    // New instance is created for the logger when the class is initialized.
    public  ClassA(){
        logger = new Logger();
        System.out.println("Logger instance - " + logger);
        logger.info("This is an info statement.");
    }
}
