package com.instanceCounter.prg;

public class SingletonMain {
    public static void main(String[] args) {
        
        Logger logger = Logger.getInstance();

        logger.log("Application started");
        logger.log("User logged in");
        
        System.out.println(logger.getLog());

        logger.clearLog();

        System.out.println("Logs after clearing:");
        System.out.println(logger.getLog());
    }
}