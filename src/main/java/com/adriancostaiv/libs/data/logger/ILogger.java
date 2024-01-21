package com.adriancostaiv.libs.data.logger;

import java.util.logging.Logger;

public class ILogger {
    private ILogger(){}
    /*

    SEVERE (highest)
    WARNING
    INFO
    CONFIG
    FINE
    FINER
    FINEST
    // Logger logger = Logger.getLogger(Logger.class.getName());
    // Logger logger = Logger.getLogger(MyClass.class.getName());
    // java.util.logging.Logger
    //*/

    static ILogger logger = null;
    public static ILogger getLogger(){
        if(logger==null){
            logger = new ILogger();
        }
        return logger;
    }

    public void info(String info){
        System.out.println(info);
    }



}
