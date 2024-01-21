package com.adriancostaiv.libs.data.writer;

import com.adriancostaiv.libs.data.logger.ILogger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    static final ILogger logger = ILogger.getLogger();
    public static boolean writeString(String fileName, String data){
        boolean processOk = true;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(data);
            writer.close();
        } catch (IOException ex) {
            processOk = false;
            logger.info(ex.getMessage());
        }
        return processOk;
    }
}
