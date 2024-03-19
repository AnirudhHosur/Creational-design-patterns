package com.after;

/**Singleton design pattern - Implementation
 Steps to be followed:
 - Instance type as private static
 - Constructor should be private (so that it cannot be called outside of class and it depends on one instance)
 - Public method for returning instance
 - Implement lazy initialization within static method. This creates an instance at first call and put it
 in static field. So this method returns same instance on subsequent calls.
 - Go to client code and replace all calls to singleton's constructor with calls to its static method.
 **/

/**
 * The singleton class must provide a global access point to get the instance of the class.
 * Singleton pattern is used for logging, drivers objects, caching and database instance.
 */

public class SingletonLogger {
    private static SingletonLogger instance;

    private SingletonLogger() {
        System.out.println("New Logger object created.");
    }

    // Single instance is created for the logger and is called in other classes.
    public static SingletonLogger getInstance() {
        if(instance == null) {
            instance = new SingletonLogger();
        }
        else {
            System.out.println("Using existing logger object.");
        }
        return instance;
    }

    public void info(String message){
        System.out.println("INFO : " + message);
    }

    public void error(String message){
        System.out.println("ERROR : "+ message);
    }
}