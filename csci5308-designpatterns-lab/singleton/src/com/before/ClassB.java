package com.before;

public class ClassB {
    private Logger logger;

    // New instance is created for the logger when the class is initialized.
    public ClassB(){
        logger = new Logger();
        System.out.println("Logger instance - " + logger);
        logger.error("This is an error statement.");
    }
}
