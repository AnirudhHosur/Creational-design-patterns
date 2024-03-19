package com.before;

public class Logger {

    public Logger(){
        System.out.println("New Logger object created.");
    }

    public void info(String message){
        System.out.println("INFO : " + message);
    }

    public void error(String message){
        System.out.println("ERROR : "+ message);
    }
}
